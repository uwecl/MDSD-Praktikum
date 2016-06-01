package edu.kit.ipd.sdq.mdsdpc.repository.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.kit.ipd.sdq.mdsdpc.repository.services.RepositoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRepositoryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Repository'", "'{'", "'interface'", "','", "'}'", "'component'", "'Interface'", "'signature'", "'Component'", "'behaviourdescription'", "'service'", "'requiredrole'", "'providedrole'", "'Signature'", "'returntype'", "'parameter'", "'Parameter'", "'parametertype'", "'ReturnType'", "'ParameterType'", "'Simple'", "'kind'", "'Complex'", "'simple'", "'Void'", "'BehaviourDescription'", "'Service'", "'correspondingSignatures'", "'('", "')'", "'RequiredRole'", "'ProvidedRole'", "'CompositeComponent'", "'assemblycontext'", "'delegationconnector'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'AssemblyContext'", "'DelegationConnector'", "'role'", "'Role'", "'int'", "'boolean'", "'char'", "'date'", "'double'", "'float'", "'list'", "'long'", "'map'", "'string'"
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


        public InternalRepositoryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRepositoryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRepositoryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRepository.g"; }



     	private RepositoryGrammarAccess grammarAccess;

        public InternalRepositoryParser(TokenStream input, RepositoryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Repository";
       	}

       	@Override
       	protected RepositoryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRepository"
    // InternalRepository.g:65:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalRepository.g:65:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalRepository.g:66:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalRepository.g:72:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_interface_5_0 = null;

        EObject lv_interface_7_0 = null;

        EObject lv_component_11_0 = null;

        EObject lv_component_13_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:78:2: ( ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalRepository.g:79:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalRepository.g:79:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalRepository.g:80:3: () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}' )? (otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalRepository.g:80:3: ()
            // InternalRepository.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRepository.g:95:3: (otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRepository.g:96:4: otherlv_3= 'interface' otherlv_4= '{' ( (lv_interface_5_0= ruleInterface ) ) (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getInterfaceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRepository.g:104:4: ( (lv_interface_5_0= ruleInterface ) )
                    // InternalRepository.g:105:5: (lv_interface_5_0= ruleInterface )
                    {
                    // InternalRepository.g:105:5: (lv_interface_5_0= ruleInterface )
                    // InternalRepository.g:106:6: lv_interface_5_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getInterfaceInterfaceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_interface_5_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"interface",
                    							lv_interface_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepository.g:123:4: (otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRepository.g:124:5: otherlv_6= ',' ( (lv_interface_7_0= ruleInterface ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRepository.g:128:5: ( (lv_interface_7_0= ruleInterface ) )
                    	    // InternalRepository.g:129:6: (lv_interface_7_0= ruleInterface )
                    	    {
                    	    // InternalRepository.g:129:6: (lv_interface_7_0= ruleInterface )
                    	    // InternalRepository.g:130:7: lv_interface_7_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getInterfaceInterfaceParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_interface_7_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface",
                    	    								lv_interface_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalRepository.g:153:3: (otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRepository.g:154:4: otherlv_9= 'component' otherlv_10= '{' ( (lv_component_11_0= ruleComponent ) ) (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getComponentKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRepository.g:162:4: ( (lv_component_11_0= ruleComponent ) )
                    // InternalRepository.g:163:5: (lv_component_11_0= ruleComponent )
                    {
                    // InternalRepository.g:163:5: (lv_component_11_0= ruleComponent )
                    // InternalRepository.g:164:6: lv_component_11_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getComponentComponentParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_component_11_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"component",
                    							lv_component_11_0,
                    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepository.g:181:4: (otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRepository.g:182:5: otherlv_12= ',' ( (lv_component_13_0= ruleComponent ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRepositoryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRepository.g:186:5: ( (lv_component_13_0= ruleComponent ) )
                    	    // InternalRepository.g:187:6: (lv_component_13_0= ruleComponent )
                    	    {
                    	    // InternalRepository.g:187:6: (lv_component_13_0= ruleComponent )
                    	    // InternalRepository.g:188:7: lv_component_13_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getComponentComponentParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_component_13_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"component",
                    	    								lv_component_13_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Component");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleComponent"
    // InternalRepository.g:219:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalRepository.g:219:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalRepository.g:220:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalRepository.g:226:1: ruleComponent returns [EObject current=null] : (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Component_Impl_0 = null;

        EObject this_CompositeComponent_1 = null;



        	enterRule();

        try {
            // InternalRepository.g:232:2: ( (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent ) )
            // InternalRepository.g:233:2: (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent )
            {
            // InternalRepository.g:233:2: (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==43) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRepository.g:234:3: this_Component_Impl_0= ruleComponent_Impl
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getComponent_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_Impl_0=ruleComponent_Impl();

                    state._fsp--;


                    			current = this_Component_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRepository.g:243:3: this_CompositeComponent_1= ruleCompositeComponent
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getCompositeComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeComponent_1=ruleCompositeComponent();

                    state._fsp--;


                    			current = this_CompositeComponent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleBehaviourDescription"
    // InternalRepository.g:255:1: entryRuleBehaviourDescription returns [EObject current=null] : iv_ruleBehaviourDescription= ruleBehaviourDescription EOF ;
    public final EObject entryRuleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourDescription = null;


        try {
            // InternalRepository.g:255:61: (iv_ruleBehaviourDescription= ruleBehaviourDescription EOF )
            // InternalRepository.g:256:2: iv_ruleBehaviourDescription= ruleBehaviourDescription EOF
            {
             newCompositeNode(grammarAccess.getBehaviourDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviourDescription=ruleBehaviourDescription();

            state._fsp--;

             current =iv_ruleBehaviourDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviourDescription"


    // $ANTLR start "ruleBehaviourDescription"
    // InternalRepository.g:262:1: ruleBehaviourDescription returns [EObject current=null] : (this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) ;
    public final EObject ruleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject this_BehaviourDescription_Impl_0 = null;

        EObject this_InternalAction_1 = null;

        EObject this_ExternalCall_2 = null;

        EObject this_Loop_3 = null;

        EObject this_Branch_4 = null;



        	enterRule();

        try {
            // InternalRepository.g:268:2: ( (this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) )
            // InternalRepository.g:269:2: (this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            {
            // InternalRepository.g:269:2: (this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt6=1;
                }
                break;
            case 46:
                {
                alt6=2;
                }
                break;
            case 47:
                {
                alt6=3;
                }
                break;
            case 48:
                {
                alt6=4;
                }
                break;
            case 49:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRepository.g:270:3: this_BehaviourDescription_Impl_0= ruleBehaviourDescription_Impl
                    {

                    			newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescription_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviourDescription_Impl_0=ruleBehaviourDescription_Impl();

                    state._fsp--;


                    			current = this_BehaviourDescription_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRepository.g:279:3: this_InternalAction_1= ruleInternalAction
                    {

                    			newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getInternalActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalAction_1=ruleInternalAction();

                    state._fsp--;


                    			current = this_InternalAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRepository.g:288:3: this_ExternalCall_2= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getExternalCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_2=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRepository.g:297:3: this_Loop_3= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_3=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRepository.g:306:3: this_Branch_4= ruleBranch
                    {

                    			newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getBranchParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Branch_4=ruleBranch();

                    state._fsp--;


                    			current = this_Branch_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviourDescription"


    // $ANTLR start "entryRuleInterface"
    // InternalRepository.g:318:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalRepository.g:318:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalRepository.g:319:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalRepository.g:325:1: ruleInterface returns [EObject current=null] : ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_signature_6_0 = null;

        EObject lv_signature_8_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:331:2: ( ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRepository.g:332:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRepository.g:332:2: ( () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRepository.g:333:3: () otherlv_1= 'Interface' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalRepository.g:333:3: ()
            // InternalRepository.g:334:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
            		
            // InternalRepository.g:344:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRepository.g:345:4: (lv_name_2_0= ruleEString )
            {
            // InternalRepository.g:345:4: (lv_name_2_0= ruleEString )
            // InternalRepository.g:346:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRepository.g:367:3: (otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRepository.g:368:4: otherlv_4= 'signature' otherlv_5= '{' ( (lv_signature_6_0= ruleSignature ) ) (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getSignatureKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRepository.g:376:4: ( (lv_signature_6_0= ruleSignature ) )
                    // InternalRepository.g:377:5: (lv_signature_6_0= ruleSignature )
                    {
                    // InternalRepository.g:377:5: (lv_signature_6_0= ruleSignature )
                    // InternalRepository.g:378:6: lv_signature_6_0= ruleSignature
                    {

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_signature_6_0=ruleSignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"signature",
                    							lv_signature_6_0,
                    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Signature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepository.g:395:4: (otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRepository.g:396:5: otherlv_7= ',' ( (lv_signature_8_0= ruleSignature ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRepository.g:400:5: ( (lv_signature_8_0= ruleSignature ) )
                    	    // InternalRepository.g:401:6: (lv_signature_8_0= ruleSignature )
                    	    {
                    	    // InternalRepository.g:401:6: (lv_signature_8_0= ruleSignature )
                    	    // InternalRepository.g:402:7: lv_signature_8_0= ruleSignature
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_signature_8_0=ruleSignature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"signature",
                    	    								lv_signature_8_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Signature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleComponent_Impl"
    // InternalRepository.g:433:1: entryRuleComponent_Impl returns [EObject current=null] : iv_ruleComponent_Impl= ruleComponent_Impl EOF ;
    public final EObject entryRuleComponent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent_Impl = null;


        try {
            // InternalRepository.g:433:55: (iv_ruleComponent_Impl= ruleComponent_Impl EOF )
            // InternalRepository.g:434:2: iv_ruleComponent_Impl= ruleComponent_Impl EOF
            {
             newCompositeNode(grammarAccess.getComponent_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent_Impl=ruleComponent_Impl();

            state._fsp--;

             current =iv_ruleComponent_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent_Impl"


    // $ANTLR start "ruleComponent_Impl"
    // InternalRepository.g:440:1: ruleComponent_Impl returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' ) ;
    public final EObject ruleComponent_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_behaviourdescription_5_0 = null;

        EObject lv_behaviourdescription_7_0 = null;

        EObject lv_service_11_0 = null;

        EObject lv_service_13_0 = null;

        EObject lv_requiredrole_17_0 = null;

        EObject lv_requiredrole_19_0 = null;

        EObject lv_providedrole_22_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:446:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' ) )
            // InternalRepository.g:447:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' )
            {
            // InternalRepository.g:447:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' )
            // InternalRepository.g:448:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getComponent_ImplAccess().getComponentKeyword_0());
            		
            // InternalRepository.g:452:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepository.g:453:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepository.g:453:4: (lv_name_1_0= ruleEString )
            // InternalRepository.g:454:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRepository.g:475:3: (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRepository.g:476:4: otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRepository.g:484:4: ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) )
                    // InternalRepository.g:485:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    {
                    // InternalRepository.g:485:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    // InternalRepository.g:486:6: lv_behaviourdescription_5_0= ruleBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_behaviourdescription_5_0=ruleBehaviourDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    						}
                    						add(
                    							current,
                    							"behaviourdescription",
                    							lv_behaviourdescription_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.BehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepository.g:503:4: (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRepository.g:504:5: otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRepository.g:508:5: ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    // InternalRepository.g:509:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    {
                    	    // InternalRepository.g:509:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    // InternalRepository.g:510:7: lv_behaviourdescription_7_0= ruleBehaviourDescription
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_behaviourdescription_7_0=ruleBehaviourDescription();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"behaviourdescription",
                    	    								lv_behaviourdescription_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.repository.Repository.BehaviourDescription");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getComponent_ImplAccess().getServiceKeyword_4());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRepository.g:541:3: ( (lv_service_11_0= ruleService ) )
            // InternalRepository.g:542:4: (lv_service_11_0= ruleService )
            {
            // InternalRepository.g:542:4: (lv_service_11_0= ruleService )
            // InternalRepository.g:543:5: lv_service_11_0= ruleService
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_service_11_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            					}
            					add(
            						current,
            						"service",
            						lv_service_11_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepository.g:560:3: (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRepository.g:561:4: otherlv_12= ',' ( (lv_service_13_0= ruleService ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FOLLOW_16); 

            	    				newLeafNode(otherlv_12, grammarAccess.getComponent_ImplAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalRepository.g:565:4: ( (lv_service_13_0= ruleService ) )
            	    // InternalRepository.g:566:5: (lv_service_13_0= ruleService )
            	    {
            	    // InternalRepository.g:566:5: (lv_service_13_0= ruleService )
            	    // InternalRepository.g:567:6: lv_service_13_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getServiceServiceParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_service_13_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            	    						}
            	    						add(
            	    							current,
            	    							"service",
            	    							lv_service_13_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_14=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_14, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalRepository.g:589:3: (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRepository.g:590:4: otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponent_ImplAccess().getRequiredroleKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRepository.g:598:4: ( (lv_requiredrole_17_0= ruleRequiredRole ) )
                    // InternalRepository.g:599:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    {
                    // InternalRepository.g:599:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    // InternalRepository.g:600:6: lv_requiredrole_17_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_requiredrole_17_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    						}
                    						add(
                    							current,
                    							"requiredrole",
                    							lv_requiredrole_17_0,
                    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepository.g:617:4: (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRepository.g:618:5: otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getComponent_ImplAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRepository.g:622:5: ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    // InternalRepository.g:623:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    {
                    	    // InternalRepository.g:623:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    // InternalRepository.g:624:7: lv_requiredrole_19_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_requiredrole_19_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredrole",
                    	    								lv_requiredrole_19_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.repository.Repository.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_20, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_21, grammarAccess.getComponent_ImplAccess().getProvidedroleKeyword_10());
            		
            // InternalRepository.g:651:3: ( (lv_providedrole_22_0= ruleProvidedRole ) )
            // InternalRepository.g:652:4: (lv_providedrole_22_0= ruleProvidedRole )
            {
            // InternalRepository.g:652:4: (lv_providedrole_22_0= ruleProvidedRole )
            // InternalRepository.g:653:5: lv_providedrole_22_0= ruleProvidedRole
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getProvidedroleProvidedRoleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_9);
            lv_providedrole_22_0=ruleProvidedRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            					}
            					set(
            						current,
            						"providedrole",
            						lv_providedrole_22_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.ProvidedRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalRepository.g:678:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRepository.g:678:47: (iv_ruleEString= ruleEString EOF )
            // InternalRepository.g:679:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRepository.g:685:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRepository.g:691:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRepository.g:692:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRepository.g:692:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRepository.g:693:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRepository.g:701:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSignature"
    // InternalRepository.g:712:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalRepository.g:712:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalRepository.g:713:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalRepository.g:719:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameter_7_0 = null;

        EObject lv_parameter_9_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:725:2: ( (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalRepository.g:726:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalRepository.g:726:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalRepository.g:727:3: otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
            		
            // InternalRepository.g:731:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepository.g:732:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepository.g:732:4: (lv_name_1_0= ruleEString )
            // InternalRepository.g:733:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getReturntypeKeyword_3());
            		
            // InternalRepository.g:758:3: ( ( ruleEString ) )
            // InternalRepository.g:759:4: ( ruleEString )
            {
            // InternalRepository.g:759:4: ( ruleEString )
            // InternalRepository.g:760:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturntypeReturnTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepository.g:774:3: (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRepository.g:775:4: otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getParameterKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRepository.g:783:4: ( (lv_parameter_7_0= ruleParameter ) )
                    // InternalRepository.g:784:5: (lv_parameter_7_0= ruleParameter )
                    {
                    // InternalRepository.g:784:5: (lv_parameter_7_0= ruleParameter )
                    // InternalRepository.g:785:6: lv_parameter_7_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_parameter_7_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_7_0,
                    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepository.g:802:4: (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRepository.g:803:5: otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_23); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRepository.g:807:5: ( (lv_parameter_9_0= ruleParameter ) )
                    	    // InternalRepository.g:808:6: (lv_parameter_9_0= ruleParameter )
                    	    {
                    	    // InternalRepository.g:808:6: (lv_parameter_9_0= ruleParameter )
                    	    // InternalRepository.g:809:7: lv_parameter_9_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParameterParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameter_9_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_9_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalRepository.g:840:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRepository.g:840:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRepository.g:841:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRepository.g:847:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:853:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalRepository.g:854:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalRepository.g:854:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalRepository.g:855:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalRepository.g:859:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepository.g:860:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepository.g:860:4: (lv_name_1_0= ruleEString )
            // InternalRepository.g:861:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getParametertypeKeyword_3());
            		
            // InternalRepository.g:886:3: ( ( ruleEString ) )
            // InternalRepository.g:887:4: ( ruleEString )
            {
            // InternalRepository.g:887:4: ( ruleEString )
            // InternalRepository.g:888:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getParametertypeParameterTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleReturnType_Impl"
    // InternalRepository.g:910:1: entryRuleReturnType_Impl returns [EObject current=null] : iv_ruleReturnType_Impl= ruleReturnType_Impl EOF ;
    public final EObject entryRuleReturnType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType_Impl = null;


        try {
            // InternalRepository.g:910:56: (iv_ruleReturnType_Impl= ruleReturnType_Impl EOF )
            // InternalRepository.g:911:2: iv_ruleReturnType_Impl= ruleReturnType_Impl EOF
            {
             newCompositeNode(grammarAccess.getReturnType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnType_Impl=ruleReturnType_Impl();

            state._fsp--;

             current =iv_ruleReturnType_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnType_Impl"


    // $ANTLR start "ruleReturnType_Impl"
    // InternalRepository.g:917:1: ruleReturnType_Impl returns [EObject current=null] : ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleReturnType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:923:2: ( ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRepository.g:924:2: ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRepository.g:924:2: ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRepository.g:925:3: () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRepository.g:925:3: ()
            // InternalRepository.g:926:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnType_ImplAccess().getReturnTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnType_ImplAccess().getReturnTypeKeyword_1());
            		
            // InternalRepository.g:936:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRepository.g:937:4: (lv_name_2_0= ruleEString )
            {
            // InternalRepository.g:937:4: (lv_name_2_0= ruleEString )
            // InternalRepository.g:938:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReturnType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnType_Impl"


    // $ANTLR start "entryRuleParameterType_Impl"
    // InternalRepository.g:959:1: entryRuleParameterType_Impl returns [EObject current=null] : iv_ruleParameterType_Impl= ruleParameterType_Impl EOF ;
    public final EObject entryRuleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType_Impl = null;


        try {
            // InternalRepository.g:959:59: (iv_ruleParameterType_Impl= ruleParameterType_Impl EOF )
            // InternalRepository.g:960:2: iv_ruleParameterType_Impl= ruleParameterType_Impl EOF
            {
             newCompositeNode(grammarAccess.getParameterType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType_Impl=ruleParameterType_Impl();

            state._fsp--;

             current =iv_ruleParameterType_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterType_Impl"


    // $ANTLR start "ruleParameterType_Impl"
    // InternalRepository.g:966:1: ruleParameterType_Impl returns [EObject current=null] : ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:972:2: ( ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRepository.g:973:2: ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRepository.g:973:2: ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRepository.g:974:3: () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRepository.g:974:3: ()
            // InternalRepository.g:975:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1());
            		
            // InternalRepository.g:985:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRepository.g:986:4: (lv_name_2_0= ruleEString )
            {
            // InternalRepository.g:986:4: (lv_name_2_0= ruleEString )
            // InternalRepository.g:987:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterType_Impl"


    // $ANTLR start "entryRuleSimple"
    // InternalRepository.g:1008:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalRepository.g:1008:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalRepository.g:1009:2: iv_ruleSimple= ruleSimple EOF
            {
             newCompositeNode(grammarAccess.getSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimple=ruleSimple();

            state._fsp--;

             current =iv_ruleSimple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalRepository.g:1015:1: ruleSimple returns [EObject current=null] : ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_kind_5_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:1021:2: ( ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' ) )
            // InternalRepository.g:1022:2: ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' )
            {
            // InternalRepository.g:1022:2: ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' )
            // InternalRepository.g:1023:3: () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}'
            {
            // InternalRepository.g:1023:3: ()
            // InternalRepository.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleAccess().getSimpleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleAccess().getSimpleKeyword_1());
            		
            // InternalRepository.g:1034:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRepository.g:1035:4: (lv_name_2_0= ruleEString )
            {
            // InternalRepository.g:1035:4: (lv_name_2_0= ruleEString )
            // InternalRepository.g:1036:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRepository.g:1057:3: (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRepository.g:1058:4: otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimpleAccess().getKindKeyword_4_0());
                    			
                    // InternalRepository.g:1062:4: ( (lv_kind_5_0= rulesimpleTypes ) )
                    // InternalRepository.g:1063:5: (lv_kind_5_0= rulesimpleTypes )
                    {
                    // InternalRepository.g:1063:5: (lv_kind_5_0= rulesimpleTypes )
                    // InternalRepository.g:1064:6: lv_kind_5_0= rulesimpleTypes
                    {

                    						newCompositeNode(grammarAccess.getSimpleAccess().getKindSimpleTypesEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_kind_5_0=rulesimpleTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.simpleTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSimpleAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleComplex"
    // InternalRepository.g:1090:1: entryRuleComplex returns [EObject current=null] : iv_ruleComplex= ruleComplex EOF ;
    public final EObject entryRuleComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplex = null;


        try {
            // InternalRepository.g:1090:48: (iv_ruleComplex= ruleComplex EOF )
            // InternalRepository.g:1091:2: iv_ruleComplex= ruleComplex EOF
            {
             newCompositeNode(grammarAccess.getComplexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplex=ruleComplex();

            state._fsp--;

             current =iv_ruleComplex; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplex"


    // $ANTLR start "ruleComplex"
    // InternalRepository.g:1097:1: ruleComplex returns [EObject current=null] : (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleComplex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_simple_5_0 = null;

        EObject lv_simple_7_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:1103:2: ( (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalRepository.g:1104:2: (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalRepository.g:1104:2: (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalRepository.g:1105:3: otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexAccess().getComplexKeyword_0());
            		
            // InternalRepository.g:1109:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepository.g:1110:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepository.g:1110:4: (lv_name_1_0= ruleEString )
            // InternalRepository.g:1111:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplexAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexAccess().getSimpleKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRepository.g:1140:3: ( (lv_simple_5_0= ruleSimple ) )
            // InternalRepository.g:1141:4: (lv_simple_5_0= ruleSimple )
            {
            // InternalRepository.g:1141:4: (lv_simple_5_0= ruleSimple )
            // InternalRepository.g:1142:5: lv_simple_5_0= ruleSimple
            {

            					newCompositeNode(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_simple_5_0=ruleSimple();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexRule());
            					}
            					add(
            						current,
            						"simple",
            						lv_simple_5_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Simple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepository.g:1159:3: (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRepository.g:1160:4: otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_28); 

            	    				newLeafNode(otherlv_6, grammarAccess.getComplexAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRepository.g:1164:4: ( (lv_simple_7_0= ruleSimple ) )
            	    // InternalRepository.g:1165:5: (lv_simple_7_0= ruleSimple )
            	    {
            	    // InternalRepository.g:1165:5: (lv_simple_7_0= ruleSimple )
            	    // InternalRepository.g:1166:6: lv_simple_7_0= ruleSimple
            	    {

            	    						newCompositeNode(grammarAccess.getComplexAccess().getSimpleSimpleParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_simple_7_0=ruleSimple();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComplexRule());
            	    						}
            	    						add(
            	    							current,
            	    							"simple",
            	    							lv_simple_7_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Simple");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getComplexAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplex"


    // $ANTLR start "entryRuleVoid"
    // InternalRepository.g:1196:1: entryRuleVoid returns [EObject current=null] : iv_ruleVoid= ruleVoid EOF ;
    public final EObject entryRuleVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoid = null;


        try {
            // InternalRepository.g:1196:45: (iv_ruleVoid= ruleVoid EOF )
            // InternalRepository.g:1197:2: iv_ruleVoid= ruleVoid EOF
            {
             newCompositeNode(grammarAccess.getVoidRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoid=ruleVoid();

            state._fsp--;

             current =iv_ruleVoid; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVoid"


    // $ANTLR start "ruleVoid"
    // InternalRepository.g:1203:1: ruleVoid returns [EObject current=null] : ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:1209:2: ( ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRepository.g:1210:2: ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRepository.g:1210:2: ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRepository.g:1211:3: () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRepository.g:1211:3: ()
            // InternalRepository.g:1212:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidAccess().getVoidAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidAccess().getVoidKeyword_1());
            		
            // InternalRepository.g:1222:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRepository.g:1223:4: (lv_name_2_0= ruleEString )
            {
            // InternalRepository.g:1223:4: (lv_name_2_0= ruleEString )
            // InternalRepository.g:1224:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVoidAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVoidRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVoid"


    // $ANTLR start "entryRuleBehaviourDescription_Impl"
    // InternalRepository.g:1245:1: entryRuleBehaviourDescription_Impl returns [EObject current=null] : iv_ruleBehaviourDescription_Impl= ruleBehaviourDescription_Impl EOF ;
    public final EObject entryRuleBehaviourDescription_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourDescription_Impl = null;


        try {
            // InternalRepository.g:1245:66: (iv_ruleBehaviourDescription_Impl= ruleBehaviourDescription_Impl EOF )
            // InternalRepository.g:1246:2: iv_ruleBehaviourDescription_Impl= ruleBehaviourDescription_Impl EOF
            {
             newCompositeNode(grammarAccess.getBehaviourDescription_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviourDescription_Impl=ruleBehaviourDescription_Impl();

            state._fsp--;

             current =iv_ruleBehaviourDescription_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviourDescription_Impl"


    // $ANTLR start "ruleBehaviourDescription_Impl"
    // InternalRepository.g:1252:1: ruleBehaviourDescription_Impl returns [EObject current=null] : ( () otherlv_1= 'BehaviourDescription' ) ;
    public final EObject ruleBehaviourDescription_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRepository.g:1258:2: ( ( () otherlv_1= 'BehaviourDescription' ) )
            // InternalRepository.g:1259:2: ( () otherlv_1= 'BehaviourDescription' )
            {
            // InternalRepository.g:1259:2: ( () otherlv_1= 'BehaviourDescription' )
            // InternalRepository.g:1260:3: () otherlv_1= 'BehaviourDescription'
            {
            // InternalRepository.g:1260:3: ()
            // InternalRepository.g:1261:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviourDescription_ImplAccess().getBehaviourDescriptionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviourDescription_Impl"


    // $ANTLR start "entryRuleService"
    // InternalRepository.g:1275:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalRepository.g:1275:48: (iv_ruleService= ruleService EOF )
            // InternalRepository.g:1276:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalRepository.g:1282:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalRepository.g:1288:2: ( (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // InternalRepository.g:1289:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // InternalRepository.g:1289:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // InternalRepository.g:1290:3: otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getCorrespondingSignaturesKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3());
            		
            // InternalRepository.g:1306:3: ( ( ruleEString ) )
            // InternalRepository.g:1307:4: ( ruleEString )
            {
            // InternalRepository.g:1307:4: ( ruleEString )
            // InternalRepository.g:1308:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_4_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepository.g:1322:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRepository.g:1323:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalRepository.g:1327:4: ( ( ruleEString ) )
            	    // InternalRepository.g:1328:5: ( ruleEString )
            	    {
            	    // InternalRepository.g:1328:5: ( ruleEString )
            	    // InternalRepository.g:1329:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getServiceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_7=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleRequiredRole"
    // InternalRepository.g:1356:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalRepository.g:1356:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalRepository.g:1357:2: iv_ruleRequiredRole= ruleRequiredRole EOF
            {
             newCompositeNode(grammarAccess.getRequiredRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredRole=ruleRequiredRole();

            state._fsp--;

             current =iv_ruleRequiredRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredRole"


    // $ANTLR start "ruleRequiredRole"
    // InternalRepository.g:1363:1: ruleRequiredRole returns [EObject current=null] : (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:1369:2: ( (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalRepository.g:1370:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalRepository.g:1370:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalRepository.g:1371:3: otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0());
            		
            // InternalRepository.g:1375:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepository.g:1376:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepository.g:1376:4: (lv_name_1_0= ruleEString )
            // InternalRepository.g:1377:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3());
            		
            // InternalRepository.g:1402:3: ( ( ruleEString ) )
            // InternalRepository.g:1403:4: ( ruleEString )
            {
            // InternalRepository.g:1403:4: ( ruleEString )
            // InternalRepository.g:1404:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRequiredRoleAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredRole"


    // $ANTLR start "entryRuleProvidedRole"
    // InternalRepository.g:1426:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalRepository.g:1426:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalRepository.g:1427:2: iv_ruleProvidedRole= ruleProvidedRole EOF
            {
             newCompositeNode(grammarAccess.getProvidedRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedRole=ruleProvidedRole();

            state._fsp--;

             current =iv_ruleProvidedRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvidedRole"


    // $ANTLR start "ruleProvidedRole"
    // InternalRepository.g:1433:1: ruleProvidedRole returns [EObject current=null] : (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:1439:2: ( (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalRepository.g:1440:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalRepository.g:1440:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalRepository.g:1441:3: otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0());
            		
            // InternalRepository.g:1445:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepository.g:1446:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepository.g:1446:4: (lv_name_1_0= ruleEString )
            // InternalRepository.g:1447:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProvidedRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3());
            		
            // InternalRepository.g:1472:3: ( ( ruleEString ) )
            // InternalRepository.g:1473:4: ( ruleEString )
            {
            // InternalRepository.g:1473:4: ( ruleEString )
            // InternalRepository.g:1474:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProvidedRoleAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvidedRole"


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalRepository.g:1496:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalRepository.g:1496:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalRepository.g:1497:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
            {
             newCompositeNode(grammarAccess.getCompositeComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeComponent=ruleCompositeComponent();

            state._fsp--;

             current =iv_ruleCompositeComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeComponent"


    // $ANTLR start "ruleCompositeComponent"
    // InternalRepository.g:1503:1: ruleCompositeComponent returns [EObject current=null] : (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' ) ;
    public final EObject ruleCompositeComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_behaviourdescription_5_0 = null;

        EObject lv_behaviourdescription_7_0 = null;

        EObject lv_service_11_0 = null;

        EObject lv_service_13_0 = null;

        EObject lv_requiredrole_17_0 = null;

        EObject lv_requiredrole_19_0 = null;

        EObject lv_providedrole_22_0 = null;

        EObject lv_assemblycontext_25_0 = null;

        EObject lv_assemblycontext_27_0 = null;

        EObject lv_delegationconnector_31_0 = null;

        EObject lv_delegationconnector_33_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:1509:2: ( (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' ) )
            // InternalRepository.g:1510:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' )
            {
            // InternalRepository.g:1510:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' )
            // InternalRepository.g:1511:3: otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0());
            		
            // InternalRepository.g:1515:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepository.g:1516:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepository.g:1516:4: (lv_name_1_0= ruleEString )
            // InternalRepository.g:1517:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRepository.g:1538:3: (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRepository.g:1539:4: otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRepository.g:1547:4: ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) )
                    // InternalRepository.g:1548:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    {
                    // InternalRepository.g:1548:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    // InternalRepository.g:1549:6: lv_behaviourdescription_5_0= ruleBehaviourDescription
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_behaviourdescription_5_0=ruleBehaviourDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"behaviourdescription",
                    							lv_behaviourdescription_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.BehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepository.g:1566:4: (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalRepository.g:1567:5: otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRepository.g:1571:5: ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    // InternalRepository.g:1572:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    {
                    	    // InternalRepository.g:1572:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    // InternalRepository.g:1573:7: lv_behaviourdescription_7_0= ruleBehaviourDescription
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionBehaviourDescriptionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_behaviourdescription_7_0=ruleBehaviourDescription();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"behaviourdescription",
                    	    								lv_behaviourdescription_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.repository.Repository.BehaviourDescription");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getServiceKeyword_4());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRepository.g:1604:3: ( (lv_service_11_0= ruleService ) )
            // InternalRepository.g:1605:4: (lv_service_11_0= ruleService )
            {
            // InternalRepository.g:1605:4: (lv_service_11_0= ruleService )
            // InternalRepository.g:1606:5: lv_service_11_0= ruleService
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_service_11_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					add(
            						current,
            						"service",
            						lv_service_11_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepository.g:1623:3: (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==14) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRepository.g:1624:4: otherlv_12= ',' ( (lv_service_13_0= ruleService ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FOLLOW_16); 

            	    				newLeafNode(otherlv_12, grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalRepository.g:1628:4: ( (lv_service_13_0= ruleService ) )
            	    // InternalRepository.g:1629:5: (lv_service_13_0= ruleService )
            	    {
            	    // InternalRepository.g:1629:5: (lv_service_13_0= ruleService )
            	    // InternalRepository.g:1630:6: lv_service_13_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getServiceServiceParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_service_13_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"service",
            	    							lv_service_13_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_14=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_14, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalRepository.g:1652:3: (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRepository.g:1653:4: otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getRequiredroleKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRepository.g:1661:4: ( (lv_requiredrole_17_0= ruleRequiredRole ) )
                    // InternalRepository.g:1662:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    {
                    // InternalRepository.g:1662:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    // InternalRepository.g:1663:6: lv_requiredrole_17_0= ruleRequiredRole
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_requiredrole_17_0=ruleRequiredRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"requiredrole",
                    							lv_requiredrole_17_0,
                    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRepository.g:1680:4: (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalRepository.g:1681:5: otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRepository.g:1685:5: ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    // InternalRepository.g:1686:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    {
                    	    // InternalRepository.g:1686:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    // InternalRepository.g:1687:7: lv_requiredrole_19_0= ruleRequiredRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredroleRequiredRoleParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_requiredrole_19_0=ruleRequiredRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requiredrole",
                    	    								lv_requiredrole_19_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.repository.Repository.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_20, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_21, grammarAccess.getCompositeComponentAccess().getProvidedroleKeyword_10());
            		
            // InternalRepository.g:1714:3: ( (lv_providedrole_22_0= ruleProvidedRole ) )
            // InternalRepository.g:1715:4: (lv_providedrole_22_0= ruleProvidedRole )
            {
            // InternalRepository.g:1715:4: (lv_providedrole_22_0= ruleProvidedRole )
            // InternalRepository.g:1716:5: lv_providedrole_22_0= ruleProvidedRole
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedroleProvidedRoleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_33);
            lv_providedrole_22_0=ruleProvidedRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"providedrole",
            						lv_providedrole_22_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.ProvidedRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getCompositeComponentAccess().getAssemblycontextKeyword_12());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_24, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalRepository.g:1741:3: ( (lv_assemblycontext_25_0= ruleAssemblyContext ) )
            // InternalRepository.g:1742:4: (lv_assemblycontext_25_0= ruleAssemblyContext )
            {
            // InternalRepository.g:1742:4: (lv_assemblycontext_25_0= ruleAssemblyContext )
            // InternalRepository.g:1743:5: lv_assemblycontext_25_0= ruleAssemblyContext
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_6);
            lv_assemblycontext_25_0=ruleAssemblyContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					add(
            						current,
            						"assemblycontext",
            						lv_assemblycontext_25_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.AssemblyContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepository.g:1760:3: (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==14) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRepository.g:1761:4: otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) )
            	    {
            	    otherlv_26=(Token)match(input,14,FOLLOW_34); 

            	    				newLeafNode(otherlv_26, grammarAccess.getCompositeComponentAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalRepository.g:1765:4: ( (lv_assemblycontext_27_0= ruleAssemblyContext ) )
            	    // InternalRepository.g:1766:5: (lv_assemblycontext_27_0= ruleAssemblyContext )
            	    {
            	    // InternalRepository.g:1766:5: (lv_assemblycontext_27_0= ruleAssemblyContext )
            	    // InternalRepository.g:1767:6: lv_assemblycontext_27_0= ruleAssemblyContext
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getAssemblycontextAssemblyContextParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_assemblycontext_27_0=ruleAssemblyContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"assemblycontext",
            	    							lv_assemblycontext_27_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.AssemblyContext");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_28=(Token)match(input,15,FOLLOW_35); 

            			newLeafNode(otherlv_28, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_29=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_29, grammarAccess.getCompositeComponentAccess().getDelegationconnectorKeyword_17());
            		
            otherlv_30=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_30, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_18());
            		
            // InternalRepository.g:1797:3: ( (lv_delegationconnector_31_0= ruleDelegationConnector ) )
            // InternalRepository.g:1798:4: (lv_delegationconnector_31_0= ruleDelegationConnector )
            {
            // InternalRepository.g:1798:4: (lv_delegationconnector_31_0= ruleDelegationConnector )
            // InternalRepository.g:1799:5: lv_delegationconnector_31_0= ruleDelegationConnector
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_6);
            lv_delegationconnector_31_0=ruleDelegationConnector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					add(
            						current,
            						"delegationconnector",
            						lv_delegationconnector_31_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.DelegationConnector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepository.g:1816:3: (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRepository.g:1817:4: otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) )
            	    {
            	    otherlv_32=(Token)match(input,14,FOLLOW_36); 

            	    				newLeafNode(otherlv_32, grammarAccess.getCompositeComponentAccess().getCommaKeyword_20_0());
            	    			
            	    // InternalRepository.g:1821:4: ( (lv_delegationconnector_33_0= ruleDelegationConnector ) )
            	    // InternalRepository.g:1822:5: (lv_delegationconnector_33_0= ruleDelegationConnector )
            	    {
            	    // InternalRepository.g:1822:5: (lv_delegationconnector_33_0= ruleDelegationConnector )
            	    // InternalRepository.g:1823:6: lv_delegationconnector_33_0= ruleDelegationConnector
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getDelegationconnectorDelegationConnectorParserRuleCall_20_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_delegationconnector_33_0=ruleDelegationConnector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"delegationconnector",
            	    							lv_delegationconnector_33_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.repository.Repository.DelegationConnector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_34=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_34, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_21());
            		
            otherlv_35=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_35, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_22());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeComponent"


    // $ANTLR start "entryRuleInternalAction"
    // InternalRepository.g:1853:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalRepository.g:1853:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalRepository.g:1854:2: iv_ruleInternalAction= ruleInternalAction EOF
            {
             newCompositeNode(grammarAccess.getInternalActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalAction=ruleInternalAction();

            state._fsp--;

             current =iv_ruleInternalAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternalAction"


    // $ANTLR start "ruleInternalAction"
    // InternalRepository.g:1860:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRepository.g:1866:2: ( ( () otherlv_1= 'InternalAction' ) )
            // InternalRepository.g:1867:2: ( () otherlv_1= 'InternalAction' )
            {
            // InternalRepository.g:1867:2: ( () otherlv_1= 'InternalAction' )
            // InternalRepository.g:1868:3: () otherlv_1= 'InternalAction'
            {
            // InternalRepository.g:1868:3: ()
            // InternalRepository.g:1869:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionAccess().getInternalActionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternalAction"


    // $ANTLR start "entryRuleExternalCall"
    // InternalRepository.g:1883:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalRepository.g:1883:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalRepository.g:1884:2: iv_ruleExternalCall= ruleExternalCall EOF
            {
             newCompositeNode(grammarAccess.getExternalCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalCall=ruleExternalCall();

            state._fsp--;

             current =iv_ruleExternalCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalCall"


    // $ANTLR start "ruleExternalCall"
    // InternalRepository.g:1890:1: ruleExternalCall returns [EObject current=null] : ( () otherlv_1= 'ExternalCall' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRepository.g:1896:2: ( ( () otherlv_1= 'ExternalCall' ) )
            // InternalRepository.g:1897:2: ( () otherlv_1= 'ExternalCall' )
            {
            // InternalRepository.g:1897:2: ( () otherlv_1= 'ExternalCall' )
            // InternalRepository.g:1898:3: () otherlv_1= 'ExternalCall'
            {
            // InternalRepository.g:1898:3: ()
            // InternalRepository.g:1899:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalCallAccess().getExternalCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalCallAccess().getExternalCallKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalCall"


    // $ANTLR start "entryRuleLoop"
    // InternalRepository.g:1913:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalRepository.g:1913:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalRepository.g:1914:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalRepository.g:1920:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRepository.g:1926:2: ( ( () otherlv_1= 'Loop' ) )
            // InternalRepository.g:1927:2: ( () otherlv_1= 'Loop' )
            {
            // InternalRepository.g:1927:2: ( () otherlv_1= 'Loop' )
            // InternalRepository.g:1928:3: () otherlv_1= 'Loop'
            {
            // InternalRepository.g:1928:3: ()
            // InternalRepository.g:1929:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBranch"
    // InternalRepository.g:1943:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalRepository.g:1943:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalRepository.g:1944:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalRepository.g:1950:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRepository.g:1956:2: ( ( () otherlv_1= 'Branch' ) )
            // InternalRepository.g:1957:2: ( () otherlv_1= 'Branch' )
            {
            // InternalRepository.g:1957:2: ( () otherlv_1= 'Branch' )
            // InternalRepository.g:1958:3: () otherlv_1= 'Branch'
            {
            // InternalRepository.g:1958:3: ()
            // InternalRepository.g:1959:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getBranchKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalRepository.g:1973:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalRepository.g:1973:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalRepository.g:1974:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
            {
             newCompositeNode(grammarAccess.getAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyContext=ruleAssemblyContext();

            state._fsp--;

             current =iv_ruleAssemblyContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssemblyContext"


    // $ANTLR start "ruleAssemblyContext"
    // InternalRepository.g:1980:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:1986:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalRepository.g:1987:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalRepository.g:1987:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalRepository.g:1988:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalRepository.g:1992:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepository.g:1993:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepository.g:1993:4: (lv_name_1_0= ruleEString )
            // InternalRepository.g:1994:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getComponentKeyword_3());
            		
            // InternalRepository.g:2019:3: ( ( ruleEString ) )
            // InternalRepository.g:2020:4: ( ruleEString )
            {
            // InternalRepository.g:2020:4: ( ruleEString )
            // InternalRepository.g:2021:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssemblyContext"


    // $ANTLR start "entryRuleDelegationConnector"
    // InternalRepository.g:2043:1: entryRuleDelegationConnector returns [EObject current=null] : iv_ruleDelegationConnector= ruleDelegationConnector EOF ;
    public final EObject entryRuleDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnector = null;


        try {
            // InternalRepository.g:2043:60: (iv_ruleDelegationConnector= ruleDelegationConnector EOF )
            // InternalRepository.g:2044:2: iv_ruleDelegationConnector= ruleDelegationConnector EOF
            {
             newCompositeNode(grammarAccess.getDelegationConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelegationConnector=ruleDelegationConnector();

            state._fsp--;

             current =iv_ruleDelegationConnector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelegationConnector"


    // $ANTLR start "ruleDelegationConnector"
    // InternalRepository.g:2050:1: ruleDelegationConnector returns [EObject current=null] : (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleDelegationConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:2056:2: ( (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalRepository.g:2057:2: (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalRepository.g:2057:2: (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalRepository.g:2058:3: otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0());
            		
            // InternalRepository.g:2062:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepository.g:2063:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepository.g:2063:4: (lv_name_1_0= ruleEString )
            // InternalRepository.g:2064:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelegationConnectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,52,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getDelegationConnectorAccess().getRoleKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDelegationConnectorAccess().getLeftParenthesisKeyword_4());
            		
            // InternalRepository.g:2093:3: ( ( ruleEString ) )
            // InternalRepository.g:2094:4: ( ruleEString )
            {
            // InternalRepository.g:2094:4: ( ruleEString )
            // InternalRepository.g:2095:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_5_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRepository.g:2109:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==14) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRepository.g:2110:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDelegationConnectorAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRepository.g:2114:4: ( ( ruleEString ) )
            	    // InternalRepository.g:2115:5: ( ruleEString )
            	    {
            	    // InternalRepository.g:2115:5: ( ruleEString )
            	    // InternalRepository.g:2116:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDelegationConnectorRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_8=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getDelegationConnectorAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDelegationConnectorAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelegationConnector"


    // $ANTLR start "entryRuleRole_Impl"
    // InternalRepository.g:2143:1: entryRuleRole_Impl returns [EObject current=null] : iv_ruleRole_Impl= ruleRole_Impl EOF ;
    public final EObject entryRuleRole_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole_Impl = null;


        try {
            // InternalRepository.g:2143:50: (iv_ruleRole_Impl= ruleRole_Impl EOF )
            // InternalRepository.g:2144:2: iv_ruleRole_Impl= ruleRole_Impl EOF
            {
             newCompositeNode(grammarAccess.getRole_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole_Impl=ruleRole_Impl();

            state._fsp--;

             current =iv_ruleRole_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole_Impl"


    // $ANTLR start "ruleRole_Impl"
    // InternalRepository.g:2150:1: ruleRole_Impl returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRole_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRepository.g:2156:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalRepository.g:2157:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalRepository.g:2157:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalRepository.g:2158:3: otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRole_ImplAccess().getRoleKeyword_0());
            		
            // InternalRepository.g:2162:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRepository.g:2163:4: (lv_name_1_0= ruleEString )
            {
            // InternalRepository.g:2163:4: (lv_name_1_0= ruleEString )
            // InternalRepository.g:2164:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRole_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRole_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.kit.ipd.sdq.mdsdpc.repository.Repository.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getRole_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRole_ImplAccess().getInterfaceKeyword_3());
            		
            // InternalRepository.g:2189:3: ( ( ruleEString ) )
            // InternalRepository.g:2190:4: ( ruleEString )
            {
            // InternalRepository.g:2190:4: ( ruleEString )
            // InternalRepository.g:2191:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRole_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRole_ImplAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole_Impl"


    // $ANTLR start "rulesimpleTypes"
    // InternalRepository.g:2213:1: rulesimpleTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) ) ;
    public final Enumerator rulesimpleTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalRepository.g:2219:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) ) )
            // InternalRepository.g:2220:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) )
            {
            // InternalRepository.g:2220:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) )
            int alt28=10;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt28=1;
                }
                break;
            case 55:
                {
                alt28=2;
                }
                break;
            case 56:
                {
                alt28=3;
                }
                break;
            case 57:
                {
                alt28=4;
                }
                break;
            case 58:
                {
                alt28=5;
                }
                break;
            case 59:
                {
                alt28=6;
                }
                break;
            case 60:
                {
                alt28=7;
                }
                break;
            case 61:
                {
                alt28=8;
                }
                break;
            case 62:
                {
                alt28=9;
                }
                break;
            case 63:
                {
                alt28=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalRepository.g:2221:3: (enumLiteral_0= 'int' )
                    {
                    // InternalRepository.g:2221:3: (enumLiteral_0= 'int' )
                    // InternalRepository.g:2222:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRepository.g:2229:3: (enumLiteral_1= 'boolean' )
                    {
                    // InternalRepository.g:2229:3: (enumLiteral_1= 'boolean' )
                    // InternalRepository.g:2230:4: enumLiteral_1= 'boolean'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRepository.g:2237:3: (enumLiteral_2= 'char' )
                    {
                    // InternalRepository.g:2237:3: (enumLiteral_2= 'char' )
                    // InternalRepository.g:2238:4: enumLiteral_2= 'char'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRepository.g:2245:3: (enumLiteral_3= 'date' )
                    {
                    // InternalRepository.g:2245:3: (enumLiteral_3= 'date' )
                    // InternalRepository.g:2246:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRepository.g:2253:3: (enumLiteral_4= 'double' )
                    {
                    // InternalRepository.g:2253:3: (enumLiteral_4= 'double' )
                    // InternalRepository.g:2254:4: enumLiteral_4= 'double'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRepository.g:2261:3: (enumLiteral_5= 'float' )
                    {
                    // InternalRepository.g:2261:3: (enumLiteral_5= 'float' )
                    // InternalRepository.g:2262:4: enumLiteral_5= 'float'
                    {
                    enumLiteral_5=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRepository.g:2269:3: (enumLiteral_6= 'list' )
                    {
                    // InternalRepository.g:2269:3: (enumLiteral_6= 'list' )
                    // InternalRepository.g:2270:4: enumLiteral_6= 'list'
                    {
                    enumLiteral_6=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRepository.g:2277:3: (enumLiteral_7= 'long' )
                    {
                    // InternalRepository.g:2277:3: (enumLiteral_7= 'long' )
                    // InternalRepository.g:2278:4: enumLiteral_7= 'long'
                    {
                    enumLiteral_7=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalRepository.g:2285:3: (enumLiteral_8= 'map' )
                    {
                    // InternalRepository.g:2285:3: (enumLiteral_8= 'map' )
                    // InternalRepository.g:2286:4: enumLiteral_8= 'map'
                    {
                    enumLiteral_8=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalRepository.g:2293:3: (enumLiteral_9= 'string' )
                    {
                    // InternalRepository.g:2293:3: (enumLiteral_9= 'string' )
                    // InternalRepository.g:2294:4: enumLiteral_9= 'string'
                    {
                    enumLiteral_9=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getSimpleTypesAccess().getStringEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimpleTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0003C01000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xFFC0000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000000L});

}