package edu.kit.ipd.sdq.mdsdpc.allocation.parser.antlr.internal;

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
import edu.kit.ipd.sdq.mdsdpc.allocation.services.AllocationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAllocationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Allocation'", "'{'", "'allocationcontext'", "','", "'}'", "'AllocationContext'", "'container'", "'assemblycontext'", "'AssemblyContext'", "'component'", "'Component'", "'behaviourdescription'", "'service'", "'requiredrole'", "'providedrole'", "'BehaviourDescription'", "'descriptionelement'", "'Service'", "'correspondingSignatures'", "'('", "')'", "'RequiredRole'", "'interface'", "'ProvidedRole'", "'CompositeComponent'", "'delegationconnector'", "'DescriptionElement'", "'InternalAction'", "'ExternalCall'", "'Loop'", "'Branch'", "'Signature'", "'returntype'", "'parameter'", "'Parameter'", "'parametertype'", "'ReturnType'", "'ParameterType'", "'Simple'", "'kind'", "'Complex'", "'simple'", "'Void'", "'DelegationConnector'", "'role'", "'Role'", "'int'", "'boolean'", "'char'", "'date'", "'double'", "'float'", "'list'", "'long'", "'map'", "'string'"
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

        public InternalAllocationParser(TokenStream input, AllocationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Allocation";
       	}

       	@Override
       	protected AllocationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAllocation"
    // InternalAllocation.g:65:1: entryRuleAllocation returns [EObject current=null] : iv_ruleAllocation= ruleAllocation EOF ;
    public final EObject entryRuleAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocation = null;


        try {
            // InternalAllocation.g:65:51: (iv_ruleAllocation= ruleAllocation EOF )
            // InternalAllocation.g:66:2: iv_ruleAllocation= ruleAllocation EOF
            {
             newCompositeNode(grammarAccess.getAllocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocation=ruleAllocation();

            state._fsp--;

             current =iv_ruleAllocation; 
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
    // $ANTLR end "entryRuleAllocation"


    // $ANTLR start "ruleAllocation"
    // InternalAllocation.g:72:1: ruleAllocation returns [EObject current=null] : (otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'allocationcontext' otherlv_3= '{' ( (lv_allocationcontext_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_allocationcontext_4_0 = null;

        EObject lv_allocationcontext_6_0 = null;



        	enterRule();

        try {
            // InternalAllocation.g:78:2: ( (otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'allocationcontext' otherlv_3= '{' ( (lv_allocationcontext_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalAllocation.g:79:2: (otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'allocationcontext' otherlv_3= '{' ( (lv_allocationcontext_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalAllocation.g:79:2: (otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'allocationcontext' otherlv_3= '{' ( (lv_allocationcontext_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalAllocation.g:80:3: otherlv_0= 'Allocation' otherlv_1= '{' otherlv_2= 'allocationcontext' otherlv_3= '{' ( (lv_allocationcontext_4_0= ruleAllocationContext ) ) (otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationAccess().getAllocationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationAccess().getAllocationcontextKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAllocation.g:96:3: ( (lv_allocationcontext_4_0= ruleAllocationContext ) )
            // InternalAllocation.g:97:4: (lv_allocationcontext_4_0= ruleAllocationContext )
            {
            // InternalAllocation.g:97:4: (lv_allocationcontext_4_0= ruleAllocationContext )
            // InternalAllocation.g:98:5: lv_allocationcontext_4_0= ruleAllocationContext
            {

            					newCompositeNode(grammarAccess.getAllocationAccess().getAllocationcontextAllocationContextParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_allocationcontext_4_0=ruleAllocationContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAllocationRule());
            					}
            					add(
            						current,
            						"allocationcontext",
            						lv_allocationcontext_4_0,
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.AllocationContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAllocation.g:115:3: (otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAllocation.g:116:4: otherlv_5= ',' ( (lv_allocationcontext_6_0= ruleAllocationContext ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAllocationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalAllocation.g:120:4: ( (lv_allocationcontext_6_0= ruleAllocationContext ) )
            	    // InternalAllocation.g:121:5: (lv_allocationcontext_6_0= ruleAllocationContext )
            	    {
            	    // InternalAllocation.g:121:5: (lv_allocationcontext_6_0= ruleAllocationContext )
            	    // InternalAllocation.g:122:6: lv_allocationcontext_6_0= ruleAllocationContext
            	    {

            	    						newCompositeNode(grammarAccess.getAllocationAccess().getAllocationcontextAllocationContextParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_allocationcontext_6_0=ruleAllocationContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAllocationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"allocationcontext",
            	    							lv_allocationcontext_6_0,
            	    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.AllocationContext");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAllocation"


    // $ANTLR start "entryRuleDescriptionElement"
    // InternalAllocation.g:152:1: entryRuleDescriptionElement returns [EObject current=null] : iv_ruleDescriptionElement= ruleDescriptionElement EOF ;
    public final EObject entryRuleDescriptionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionElement = null;


        try {
            // InternalAllocation.g:152:59: (iv_ruleDescriptionElement= ruleDescriptionElement EOF )
            // InternalAllocation.g:153:2: iv_ruleDescriptionElement= ruleDescriptionElement EOF
            {
             newCompositeNode(grammarAccess.getDescriptionElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionElement=ruleDescriptionElement();

            state._fsp--;

             current =iv_ruleDescriptionElement; 
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
    // $ANTLR end "entryRuleDescriptionElement"


    // $ANTLR start "ruleDescriptionElement"
    // InternalAllocation.g:159:1: ruleDescriptionElement returns [EObject current=null] : (this_DescriptionElement_Impl_0= ruleDescriptionElement_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) ;
    public final EObject ruleDescriptionElement() throws RecognitionException {
        EObject current = null;

        EObject this_DescriptionElement_Impl_0 = null;

        EObject this_InternalAction_1 = null;

        EObject this_ExternalCall_2 = null;

        EObject this_Loop_3 = null;

        EObject this_Branch_4 = null;



        	enterRule();

        try {
            // InternalAllocation.g:165:2: ( (this_DescriptionElement_Impl_0= ruleDescriptionElement_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch ) )
            // InternalAllocation.g:166:2: (this_DescriptionElement_Impl_0= ruleDescriptionElement_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            {
            // InternalAllocation.g:166:2: (this_DescriptionElement_Impl_0= ruleDescriptionElement_Impl | this_InternalAction_1= ruleInternalAction | this_ExternalCall_2= ruleExternalCall | this_Loop_3= ruleLoop | this_Branch_4= ruleBranch )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt2=1;
                }
                break;
            case 38:
                {
                alt2=2;
                }
                break;
            case 39:
                {
                alt2=3;
                }
                break;
            case 40:
                {
                alt2=4;
                }
                break;
            case 41:
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
                    // InternalAllocation.g:167:3: this_DescriptionElement_Impl_0= ruleDescriptionElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getDescriptionElementAccess().getDescriptionElement_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DescriptionElement_Impl_0=ruleDescriptionElement_Impl();

                    state._fsp--;


                    			current = this_DescriptionElement_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAllocation.g:176:3: this_InternalAction_1= ruleInternalAction
                    {

                    			newCompositeNode(grammarAccess.getDescriptionElementAccess().getInternalActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalAction_1=ruleInternalAction();

                    state._fsp--;


                    			current = this_InternalAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAllocation.g:185:3: this_ExternalCall_2= ruleExternalCall
                    {

                    			newCompositeNode(grammarAccess.getDescriptionElementAccess().getExternalCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalCall_2=ruleExternalCall();

                    state._fsp--;


                    			current = this_ExternalCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAllocation.g:194:3: this_Loop_3= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getDescriptionElementAccess().getLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_3=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAllocation.g:203:3: this_Branch_4= ruleBranch
                    {

                    			newCompositeNode(grammarAccess.getDescriptionElementAccess().getBranchParserRuleCall_4());
                    		
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
    // $ANTLR end "ruleDescriptionElement"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalAllocation.g:215:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalAllocation.g:215:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalAllocation.g:216:2: iv_ruleAllocationContext= ruleAllocationContext EOF
            {
             newCompositeNode(grammarAccess.getAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocationContext=ruleAllocationContext();

            state._fsp--;

             current =iv_ruleAllocationContext; 
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
    // $ANTLR end "entryRuleAllocationContext"


    // $ANTLR start "ruleAllocationContext"
    // InternalAllocation.g:222:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAllocation.g:228:2: ( (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalAllocation.g:229:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalAllocation.g:229:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalAllocation.g:230:3: otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'container' ( ( ruleEString ) ) otherlv_4= 'assemblycontext' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getContainerKeyword_2());
            		
            // InternalAllocation.g:242:3: ( ( ruleEString ) )
            // InternalAllocation.g:243:4: ( ruleEString )
            {
            // InternalAllocation.g:243:4: ( ruleEString )
            // InternalAllocation.g:244:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getContainerContainerCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getAllocationContextAccess().getAssemblycontextKeyword_4());
            		
            // InternalAllocation.g:262:3: ( ( ruleEString ) )
            // InternalAllocation.g:263:4: ( ruleEString )
            {
            // InternalAllocation.g:263:4: ( ruleEString )
            // InternalAllocation.g:264:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAssemblycontextAssemblyContextCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAllocationContext"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalAllocation.g:286:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalAllocation.g:286:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalAllocation.g:287:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
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
    // InternalAllocation.g:293:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAllocation.g:299:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalAllocation.g:300:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalAllocation.g:300:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalAllocation.g:301:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'component' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalAllocation.g:305:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAllocation.g:306:4: (lv_name_1_0= ruleEString )
            {
            // InternalAllocation.g:306:4: (lv_name_1_0= ruleEString )
            // InternalAllocation.g:307:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getComponentKeyword_3());
            		
            // InternalAllocation.g:332:3: ( ( ruleEString ) )
            // InternalAllocation.g:333:4: ( ruleEString )
            {
            // InternalAllocation.g:333:4: ( ruleEString )
            // InternalAllocation.g:334:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
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


    // $ANTLR start "entryRuleEString"
    // InternalAllocation.g:356:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAllocation.g:356:47: (iv_ruleEString= ruleEString EOF )
            // InternalAllocation.g:357:2: iv_ruleEString= ruleEString EOF
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
    // InternalAllocation.g:363:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAllocation.g:369:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAllocation.g:370:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAllocation.g:370:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalAllocation.g:371:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAllocation.g:379:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleComponent_Impl"
    // InternalAllocation.g:390:1: entryRuleComponent_Impl returns [EObject current=null] : iv_ruleComponent_Impl= ruleComponent_Impl EOF ;
    public final EObject entryRuleComponent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent_Impl = null;


        try {
            // InternalAllocation.g:390:55: (iv_ruleComponent_Impl= ruleComponent_Impl EOF )
            // InternalAllocation.g:391:2: iv_ruleComponent_Impl= ruleComponent_Impl EOF
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
    // InternalAllocation.g:397:1: ruleComponent_Impl returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' ) ;
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
            // InternalAllocation.g:403:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' ) )
            // InternalAllocation.g:404:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' )
            {
            // InternalAllocation.g:404:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}' )
            // InternalAllocation.g:405:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponent_ImplAccess().getComponentKeyword_0());
            		
            // InternalAllocation.g:409:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAllocation.g:410:4: (lv_name_1_0= ruleEString )
            {
            // InternalAllocation.g:410:4: (lv_name_1_0= ruleEString )
            // InternalAllocation.g:411:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAllocation.g:432:3: (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAllocation.g:433:4: otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponent_ImplAccess().getBehaviourdescriptionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalAllocation.g:441:4: ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) )
                    // InternalAllocation.g:442:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    {
                    // InternalAllocation.g:442:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    // InternalAllocation.g:443:6: lv_behaviourdescription_5_0= ruleBehaviourDescription
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
                    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.BehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAllocation.g:460:4: (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAllocation.g:461:5: otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalAllocation.g:465:5: ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    // InternalAllocation.g:466:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    {
                    	    // InternalAllocation.g:466:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    // InternalAllocation.g:467:7: lv_behaviourdescription_7_0= ruleBehaviourDescription
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
                    	    								"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.BehaviourDescription");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getComponent_ImplAccess().getServiceKeyword_4());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalAllocation.g:498:3: ( (lv_service_11_0= ruleService ) )
            // InternalAllocation.g:499:4: (lv_service_11_0= ruleService )
            {
            // InternalAllocation.g:499:4: (lv_service_11_0= ruleService )
            // InternalAllocation.g:500:5: lv_service_11_0= ruleService
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAllocation.g:517:3: (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAllocation.g:518:4: otherlv_12= ',' ( (lv_service_13_0= ruleService ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FOLLOW_15); 

            	    				newLeafNode(otherlv_12, grammarAccess.getComponent_ImplAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalAllocation.g:522:4: ( (lv_service_13_0= ruleService ) )
            	    // InternalAllocation.g:523:5: (lv_service_13_0= ruleService )
            	    {
            	    // InternalAllocation.g:523:5: (lv_service_13_0= ruleService )
            	    // InternalAllocation.g:524:6: lv_service_13_0= ruleService
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
            	    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_14=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_14, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalAllocation.g:546:3: (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAllocation.g:547:4: otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponent_ImplAccess().getRequiredroleKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalAllocation.g:555:4: ( (lv_requiredrole_17_0= ruleRequiredRole ) )
                    // InternalAllocation.g:556:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    {
                    // InternalAllocation.g:556:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    // InternalAllocation.g:557:6: lv_requiredrole_17_0= ruleRequiredRole
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
                    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAllocation.g:574:4: (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAllocation.g:575:5: otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getComponent_ImplAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAllocation.g:579:5: ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    // InternalAllocation.g:580:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    {
                    	    // InternalAllocation.g:580:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    // InternalAllocation.g:581:7: lv_requiredrole_19_0= ruleRequiredRole
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
                    	    								"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_20, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_21, grammarAccess.getComponent_ImplAccess().getProvidedroleKeyword_10());
            		
            // InternalAllocation.g:608:3: ( (lv_providedrole_22_0= ruleProvidedRole ) )
            // InternalAllocation.g:609:4: (lv_providedrole_22_0= ruleProvidedRole )
            {
            // InternalAllocation.g:609:4: (lv_providedrole_22_0= ruleProvidedRole )
            // InternalAllocation.g:610:5: lv_providedrole_22_0= ruleProvidedRole
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getProvidedroleProvidedRoleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_7);
            lv_providedrole_22_0=ruleProvidedRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            					}
            					set(
            						current,
            						"providedrole",
            						lv_providedrole_22_0,
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.ProvidedRole");
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


    // $ANTLR start "entryRuleBehaviourDescription"
    // InternalAllocation.g:635:1: entryRuleBehaviourDescription returns [EObject current=null] : iv_ruleBehaviourDescription= ruleBehaviourDescription EOF ;
    public final EObject entryRuleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourDescription = null;


        try {
            // InternalAllocation.g:635:61: (iv_ruleBehaviourDescription= ruleBehaviourDescription EOF )
            // InternalAllocation.g:636:2: iv_ruleBehaviourDescription= ruleBehaviourDescription EOF
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
    // InternalAllocation.g:642:1: ruleBehaviourDescription returns [EObject current=null] : ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBehaviourDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_descriptionelement_5_0 = null;

        EObject lv_descriptionelement_7_0 = null;



        	enterRule();

        try {
            // InternalAllocation.g:648:2: ( ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalAllocation.g:649:2: ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalAllocation.g:649:2: ( () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalAllocation.g:650:3: () otherlv_1= 'BehaviourDescription' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalAllocation.g:650:3: ()
            // InternalAllocation.g:651:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviourDescriptionAccess().getBehaviourDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAllocation.g:665:3: (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAllocation.g:666:4: otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviourDescriptionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalAllocation.g:674:4: ( (lv_descriptionelement_5_0= ruleDescriptionElement ) )
                    // InternalAllocation.g:675:5: (lv_descriptionelement_5_0= ruleDescriptionElement )
                    {
                    // InternalAllocation.g:675:5: (lv_descriptionelement_5_0= ruleDescriptionElement )
                    // InternalAllocation.g:676:6: lv_descriptionelement_5_0= ruleDescriptionElement
                    {

                    						newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementDescriptionElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_descriptionelement_5_0=ruleDescriptionElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"descriptionelement",
                    							lv_descriptionelement_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.DescriptionElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAllocation.g:693:4: (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalAllocation.g:694:5: otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBehaviourDescriptionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalAllocation.g:698:5: ( (lv_descriptionelement_7_0= ruleDescriptionElement ) )
                    	    // InternalAllocation.g:699:6: (lv_descriptionelement_7_0= ruleDescriptionElement )
                    	    {
                    	    // InternalAllocation.g:699:6: (lv_descriptionelement_7_0= ruleDescriptionElement )
                    	    // InternalAllocation.g:700:7: lv_descriptionelement_7_0= ruleDescriptionElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviourDescriptionAccess().getDescriptionelementDescriptionElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_descriptionelement_7_0=ruleDescriptionElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviourDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"descriptionelement",
                    	    								lv_descriptionelement_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.DescriptionElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBehaviourDescriptionAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleService"
    // InternalAllocation.g:731:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalAllocation.g:731:48: (iv_ruleService= ruleService EOF )
            // InternalAllocation.g:732:2: iv_ruleService= ruleService EOF
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
    // InternalAllocation.g:738:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
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
            // InternalAllocation.g:744:2: ( (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // InternalAllocation.g:745:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // InternalAllocation.g:745:2: (otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // InternalAllocation.g:746:3: otherlv_0= 'Service' otherlv_1= '{' otherlv_2= 'correspondingSignatures' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getCorrespondingSignaturesKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3());
            		
            // InternalAllocation.g:762:3: ( ( ruleEString ) )
            // InternalAllocation.g:763:4: ( ruleEString )
            {
            // InternalAllocation.g:763:4: ( ruleEString )
            // InternalAllocation.g:764:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_4_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAllocation.g:778:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAllocation.g:779:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_9); 

            	    				newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalAllocation.g:783:4: ( ( ruleEString ) )
            	    // InternalAllocation.g:784:5: ( ruleEString )
            	    {
            	    // InternalAllocation.g:784:5: ( ruleEString )
            	    // InternalAllocation.g:785:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getServiceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getServiceAccess().getCorrespondingSignaturesSignatureCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,31,FOLLOW_7); 

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
    // InternalAllocation.g:812:1: entryRuleRequiredRole returns [EObject current=null] : iv_ruleRequiredRole= ruleRequiredRole EOF ;
    public final EObject entryRuleRequiredRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredRole = null;


        try {
            // InternalAllocation.g:812:53: (iv_ruleRequiredRole= ruleRequiredRole EOF )
            // InternalAllocation.g:813:2: iv_ruleRequiredRole= ruleRequiredRole EOF
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
    // InternalAllocation.g:819:1: ruleRequiredRole returns [EObject current=null] : (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRequiredRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAllocation.g:825:2: ( (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalAllocation.g:826:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalAllocation.g:826:2: (otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalAllocation.g:827:3: otherlv_0= 'RequiredRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredRoleAccess().getRequiredRoleKeyword_0());
            		
            // InternalAllocation.g:831:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAllocation.g:832:4: (lv_name_1_0= ruleEString )
            {
            // InternalAllocation.g:832:4: (lv_name_1_0= ruleEString )
            // InternalAllocation.g:833:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredRoleAccess().getInterfaceKeyword_3());
            		
            // InternalAllocation.g:858:3: ( ( ruleEString ) )
            // InternalAllocation.g:859:4: ( ruleEString )
            {
            // InternalAllocation.g:859:4: ( ruleEString )
            // InternalAllocation.g:860:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRequiredRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalAllocation.g:882:1: entryRuleProvidedRole returns [EObject current=null] : iv_ruleProvidedRole= ruleProvidedRole EOF ;
    public final EObject entryRuleProvidedRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedRole = null;


        try {
            // InternalAllocation.g:882:53: (iv_ruleProvidedRole= ruleProvidedRole EOF )
            // InternalAllocation.g:883:2: iv_ruleProvidedRole= ruleProvidedRole EOF
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
    // InternalAllocation.g:889:1: ruleProvidedRole returns [EObject current=null] : (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleProvidedRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAllocation.g:895:2: ( (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalAllocation.g:896:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalAllocation.g:896:2: (otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalAllocation.g:897:3: otherlv_0= 'ProvidedRole' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidedRoleAccess().getProvidedRoleKeyword_0());
            		
            // InternalAllocation.g:901:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAllocation.g:902:4: (lv_name_1_0= ruleEString )
            {
            // InternalAllocation.g:902:4: (lv_name_1_0= ruleEString )
            // InternalAllocation.g:903:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getProvidedRoleAccess().getInterfaceKeyword_3());
            		
            // InternalAllocation.g:928:3: ( ( ruleEString ) )
            // InternalAllocation.g:929:4: ( ruleEString )
            {
            // InternalAllocation.g:929:4: ( ruleEString )
            // InternalAllocation.g:930:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProvidedRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProvidedRoleAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalAllocation.g:952:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalAllocation.g:952:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalAllocation.g:953:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
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
    // InternalAllocation.g:959:1: ruleCompositeComponent returns [EObject current=null] : (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' ) ;
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
            // InternalAllocation.g:965:2: ( (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' ) )
            // InternalAllocation.g:966:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' )
            {
            // InternalAllocation.g:966:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}' )
            // InternalAllocation.g:967:3: otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )? otherlv_9= 'service' otherlv_10= '{' ( (lv_service_11_0= ruleService ) ) (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )* otherlv_14= '}' (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )? otherlv_21= 'providedrole' ( (lv_providedrole_22_0= ruleProvidedRole ) ) otherlv_23= 'assemblycontext' otherlv_24= '{' ( (lv_assemblycontext_25_0= ruleAssemblyContext ) ) (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )* otherlv_28= '}' otherlv_29= 'delegationconnector' otherlv_30= '{' ( (lv_delegationconnector_31_0= ruleDelegationConnector ) ) (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )* otherlv_34= '}' otherlv_35= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0());
            		
            // InternalAllocation.g:971:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAllocation.g:972:4: (lv_name_1_0= ruleEString )
            {
            // InternalAllocation.g:972:4: (lv_name_1_0= ruleEString )
            // InternalAllocation.g:973:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAllocation.g:994:3: (otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAllocation.g:995:4: otherlv_3= 'behaviourdescription' otherlv_4= '{' ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) ) (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getBehaviourdescriptionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalAllocation.g:1003:4: ( (lv_behaviourdescription_5_0= ruleBehaviourDescription ) )
                    // InternalAllocation.g:1004:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    {
                    // InternalAllocation.g:1004:5: (lv_behaviourdescription_5_0= ruleBehaviourDescription )
                    // InternalAllocation.g:1005:6: lv_behaviourdescription_5_0= ruleBehaviourDescription
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
                    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.BehaviourDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAllocation.g:1022:4: (otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalAllocation.g:1023:5: otherlv_6= ',' ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalAllocation.g:1027:5: ( (lv_behaviourdescription_7_0= ruleBehaviourDescription ) )
                    	    // InternalAllocation.g:1028:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    {
                    	    // InternalAllocation.g:1028:6: (lv_behaviourdescription_7_0= ruleBehaviourDescription )
                    	    // InternalAllocation.g:1029:7: lv_behaviourdescription_7_0= ruleBehaviourDescription
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
                    	    								"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.BehaviourDescription");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getServiceKeyword_4());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalAllocation.g:1060:3: ( (lv_service_11_0= ruleService ) )
            // InternalAllocation.g:1061:4: (lv_service_11_0= ruleService )
            {
            // InternalAllocation.g:1061:4: (lv_service_11_0= ruleService )
            // InternalAllocation.g:1062:5: lv_service_11_0= ruleService
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAllocation.g:1079:3: (otherlv_12= ',' ( (lv_service_13_0= ruleService ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAllocation.g:1080:4: otherlv_12= ',' ( (lv_service_13_0= ruleService ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FOLLOW_15); 

            	    				newLeafNode(otherlv_12, grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalAllocation.g:1084:4: ( (lv_service_13_0= ruleService ) )
            	    // InternalAllocation.g:1085:5: (lv_service_13_0= ruleService )
            	    {
            	    // InternalAllocation.g:1085:5: (lv_service_13_0= ruleService )
            	    // InternalAllocation.g:1086:6: lv_service_13_0= ruleService
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
            	    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_14=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_14, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalAllocation.g:1108:3: (otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAllocation.g:1109:4: otherlv_15= 'requiredrole' otherlv_16= '{' ( (lv_requiredrole_17_0= ruleRequiredRole ) ) (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getRequiredroleKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalAllocation.g:1117:4: ( (lv_requiredrole_17_0= ruleRequiredRole ) )
                    // InternalAllocation.g:1118:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    {
                    // InternalAllocation.g:1118:5: (lv_requiredrole_17_0= ruleRequiredRole )
                    // InternalAllocation.g:1119:6: lv_requiredrole_17_0= ruleRequiredRole
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
                    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.RequiredRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAllocation.g:1136:4: (otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalAllocation.g:1137:5: otherlv_18= ',' ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAllocation.g:1141:5: ( (lv_requiredrole_19_0= ruleRequiredRole ) )
                    	    // InternalAllocation.g:1142:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    {
                    	    // InternalAllocation.g:1142:6: (lv_requiredrole_19_0= ruleRequiredRole )
                    	    // InternalAllocation.g:1143:7: lv_requiredrole_19_0= ruleRequiredRole
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
                    	    								"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.RequiredRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_20, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_21, grammarAccess.getCompositeComponentAccess().getProvidedroleKeyword_10());
            		
            // InternalAllocation.g:1170:3: ( (lv_providedrole_22_0= ruleProvidedRole ) )
            // InternalAllocation.g:1171:4: (lv_providedrole_22_0= ruleProvidedRole )
            {
            // InternalAllocation.g:1171:4: (lv_providedrole_22_0= ruleProvidedRole )
            // InternalAllocation.g:1172:5: lv_providedrole_22_0= ruleProvidedRole
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedroleProvidedRoleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_10);
            lv_providedrole_22_0=ruleProvidedRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"providedrole",
            						lv_providedrole_22_0,
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.ProvidedRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getCompositeComponentAccess().getAssemblycontextKeyword_12());
            		
            otherlv_24=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_24, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalAllocation.g:1197:3: ( (lv_assemblycontext_25_0= ruleAssemblyContext ) )
            // InternalAllocation.g:1198:4: (lv_assemblycontext_25_0= ruleAssemblyContext )
            {
            // InternalAllocation.g:1198:4: (lv_assemblycontext_25_0= ruleAssemblyContext )
            // InternalAllocation.g:1199:5: lv_assemblycontext_25_0= ruleAssemblyContext
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.AssemblyContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAllocation.g:1216:3: (otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAllocation.g:1217:4: otherlv_26= ',' ( (lv_assemblycontext_27_0= ruleAssemblyContext ) )
            	    {
            	    otherlv_26=(Token)match(input,14,FOLLOW_26); 

            	    				newLeafNode(otherlv_26, grammarAccess.getCompositeComponentAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalAllocation.g:1221:4: ( (lv_assemblycontext_27_0= ruleAssemblyContext ) )
            	    // InternalAllocation.g:1222:5: (lv_assemblycontext_27_0= ruleAssemblyContext )
            	    {
            	    // InternalAllocation.g:1222:5: (lv_assemblycontext_27_0= ruleAssemblyContext )
            	    // InternalAllocation.g:1223:6: lv_assemblycontext_27_0= ruleAssemblyContext
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
            	    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.AssemblyContext");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_28=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_28, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_29=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_29, grammarAccess.getCompositeComponentAccess().getDelegationconnectorKeyword_17());
            		
            otherlv_30=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_30, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_18());
            		
            // InternalAllocation.g:1253:3: ( (lv_delegationconnector_31_0= ruleDelegationConnector ) )
            // InternalAllocation.g:1254:4: (lv_delegationconnector_31_0= ruleDelegationConnector )
            {
            // InternalAllocation.g:1254:4: (lv_delegationconnector_31_0= ruleDelegationConnector )
            // InternalAllocation.g:1255:5: lv_delegationconnector_31_0= ruleDelegationConnector
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.DelegationConnector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAllocation.g:1272:3: (otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAllocation.g:1273:4: otherlv_32= ',' ( (lv_delegationconnector_33_0= ruleDelegationConnector ) )
            	    {
            	    otherlv_32=(Token)match(input,14,FOLLOW_28); 

            	    				newLeafNode(otherlv_32, grammarAccess.getCompositeComponentAccess().getCommaKeyword_20_0());
            	    			
            	    // InternalAllocation.g:1277:4: ( (lv_delegationconnector_33_0= ruleDelegationConnector ) )
            	    // InternalAllocation.g:1278:5: (lv_delegationconnector_33_0= ruleDelegationConnector )
            	    {
            	    // InternalAllocation.g:1278:5: (lv_delegationconnector_33_0= ruleDelegationConnector )
            	    // InternalAllocation.g:1279:6: lv_delegationconnector_33_0= ruleDelegationConnector
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
            	    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.DelegationConnector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_34=(Token)match(input,15,FOLLOW_7); 

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


    // $ANTLR start "entryRuleDescriptionElement_Impl"
    // InternalAllocation.g:1309:1: entryRuleDescriptionElement_Impl returns [EObject current=null] : iv_ruleDescriptionElement_Impl= ruleDescriptionElement_Impl EOF ;
    public final EObject entryRuleDescriptionElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionElement_Impl = null;


        try {
            // InternalAllocation.g:1309:64: (iv_ruleDescriptionElement_Impl= ruleDescriptionElement_Impl EOF )
            // InternalAllocation.g:1310:2: iv_ruleDescriptionElement_Impl= ruleDescriptionElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getDescriptionElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionElement_Impl=ruleDescriptionElement_Impl();

            state._fsp--;

             current =iv_ruleDescriptionElement_Impl; 
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
    // $ANTLR end "entryRuleDescriptionElement_Impl"


    // $ANTLR start "ruleDescriptionElement_Impl"
    // InternalAllocation.g:1316:1: ruleDescriptionElement_Impl returns [EObject current=null] : ( () otherlv_1= 'DescriptionElement' ) ;
    public final EObject ruleDescriptionElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAllocation.g:1322:2: ( ( () otherlv_1= 'DescriptionElement' ) )
            // InternalAllocation.g:1323:2: ( () otherlv_1= 'DescriptionElement' )
            {
            // InternalAllocation.g:1323:2: ( () otherlv_1= 'DescriptionElement' )
            // InternalAllocation.g:1324:3: () otherlv_1= 'DescriptionElement'
            {
            // InternalAllocation.g:1324:3: ()
            // InternalAllocation.g:1325:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptionElement_ImplAccess().getDescriptionElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionElement_ImplAccess().getDescriptionElementKeyword_1());
            		

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
    // $ANTLR end "ruleDescriptionElement_Impl"


    // $ANTLR start "entryRuleInternalAction"
    // InternalAllocation.g:1339:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalAllocation.g:1339:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalAllocation.g:1340:2: iv_ruleInternalAction= ruleInternalAction EOF
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
    // InternalAllocation.g:1346:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAllocation.g:1352:2: ( ( () otherlv_1= 'InternalAction' ) )
            // InternalAllocation.g:1353:2: ( () otherlv_1= 'InternalAction' )
            {
            // InternalAllocation.g:1353:2: ( () otherlv_1= 'InternalAction' )
            // InternalAllocation.g:1354:3: () otherlv_1= 'InternalAction'
            {
            // InternalAllocation.g:1354:3: ()
            // InternalAllocation.g:1355:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

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
    // InternalAllocation.g:1369:1: entryRuleExternalCall returns [EObject current=null] : iv_ruleExternalCall= ruleExternalCall EOF ;
    public final EObject entryRuleExternalCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalCall = null;


        try {
            // InternalAllocation.g:1369:53: (iv_ruleExternalCall= ruleExternalCall EOF )
            // InternalAllocation.g:1370:2: iv_ruleExternalCall= ruleExternalCall EOF
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
    // InternalAllocation.g:1376:1: ruleExternalCall returns [EObject current=null] : ( () otherlv_1= 'ExternalCall' ) ;
    public final EObject ruleExternalCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAllocation.g:1382:2: ( ( () otherlv_1= 'ExternalCall' ) )
            // InternalAllocation.g:1383:2: ( () otherlv_1= 'ExternalCall' )
            {
            // InternalAllocation.g:1383:2: ( () otherlv_1= 'ExternalCall' )
            // InternalAllocation.g:1384:3: () otherlv_1= 'ExternalCall'
            {
            // InternalAllocation.g:1384:3: ()
            // InternalAllocation.g:1385:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalCallAccess().getExternalCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

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
    // InternalAllocation.g:1399:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalAllocation.g:1399:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalAllocation.g:1400:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalAllocation.g:1406:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_descriptionelement_5_0 = null;

        EObject lv_descriptionelement_7_0 = null;



        	enterRule();

        try {
            // InternalAllocation.g:1412:2: ( ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalAllocation.g:1413:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalAllocation.g:1413:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalAllocation.g:1414:3: () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalAllocation.g:1414:3: ()
            // InternalAllocation.g:1415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAllocation.g:1429:3: (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAllocation.g:1430:4: otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getDescriptionelementKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalAllocation.g:1438:4: ( (lv_descriptionelement_5_0= ruleDescriptionElement ) )
                    // InternalAllocation.g:1439:5: (lv_descriptionelement_5_0= ruleDescriptionElement )
                    {
                    // InternalAllocation.g:1439:5: (lv_descriptionelement_5_0= ruleDescriptionElement )
                    // InternalAllocation.g:1440:6: lv_descriptionelement_5_0= ruleDescriptionElement
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getDescriptionelementDescriptionElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_descriptionelement_5_0=ruleDescriptionElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"descriptionelement",
                    							lv_descriptionelement_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.DescriptionElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAllocation.g:1457:4: (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalAllocation.g:1458:5: otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalAllocation.g:1462:5: ( (lv_descriptionelement_7_0= ruleDescriptionElement ) )
                    	    // InternalAllocation.g:1463:6: (lv_descriptionelement_7_0= ruleDescriptionElement )
                    	    {
                    	    // InternalAllocation.g:1463:6: (lv_descriptionelement_7_0= ruleDescriptionElement )
                    	    // InternalAllocation.g:1464:7: lv_descriptionelement_7_0= ruleDescriptionElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getDescriptionelementDescriptionElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_descriptionelement_7_0=ruleDescriptionElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"descriptionelement",
                    	    								lv_descriptionelement_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.DescriptionElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalAllocation.g:1495:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalAllocation.g:1495:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalAllocation.g:1496:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalAllocation.g:1502:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_descriptionelement_5_0 = null;

        EObject lv_descriptionelement_7_0 = null;



        	enterRule();

        try {
            // InternalAllocation.g:1508:2: ( ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalAllocation.g:1509:2: ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalAllocation.g:1509:2: ( () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalAllocation.g:1510:3: () otherlv_1= 'Branch' otherlv_2= '{' (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalAllocation.g:1510:3: ()
            // InternalAllocation.g:1511:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getBranchKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAllocation.g:1525:3: (otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAllocation.g:1526:4: otherlv_3= 'descriptionelement' otherlv_4= '{' ( (lv_descriptionelement_5_0= ruleDescriptionElement ) ) (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getDescriptionelementKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalAllocation.g:1534:4: ( (lv_descriptionelement_5_0= ruleDescriptionElement ) )
                    // InternalAllocation.g:1535:5: (lv_descriptionelement_5_0= ruleDescriptionElement )
                    {
                    // InternalAllocation.g:1535:5: (lv_descriptionelement_5_0= ruleDescriptionElement )
                    // InternalAllocation.g:1536:6: lv_descriptionelement_5_0= ruleDescriptionElement
                    {

                    						newCompositeNode(grammarAccess.getBranchAccess().getDescriptionelementDescriptionElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_descriptionelement_5_0=ruleDescriptionElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBranchRule());
                    						}
                    						add(
                    							current,
                    							"descriptionelement",
                    							lv_descriptionelement_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.DescriptionElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAllocation.g:1553:4: (otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalAllocation.g:1554:5: otherlv_6= ',' ( (lv_descriptionelement_7_0= ruleDescriptionElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalAllocation.g:1558:5: ( (lv_descriptionelement_7_0= ruleDescriptionElement ) )
                    	    // InternalAllocation.g:1559:6: (lv_descriptionelement_7_0= ruleDescriptionElement )
                    	    {
                    	    // InternalAllocation.g:1559:6: (lv_descriptionelement_7_0= ruleDescriptionElement )
                    	    // InternalAllocation.g:1560:7: lv_descriptionelement_7_0= ruleDescriptionElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getBranchAccess().getDescriptionelementDescriptionElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_descriptionelement_7_0=ruleDescriptionElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBranchRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"descriptionelement",
                    	    								lv_descriptionelement_7_0,
                    	    								"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.DescriptionElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleSignature"
    // InternalAllocation.g:1591:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalAllocation.g:1591:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalAllocation.g:1592:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalAllocation.g:1598:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalAllocation.g:1604:2: ( (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalAllocation.g:1605:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalAllocation.g:1605:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalAllocation.g:1606:3: otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returntype' ( ( ruleEString ) ) (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
            		
            // InternalAllocation.g:1610:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAllocation.g:1611:4: (lv_name_1_0= ruleEString )
            {
            // InternalAllocation.g:1611:4: (lv_name_1_0= ruleEString )
            // InternalAllocation.g:1612:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getReturntypeKeyword_3());
            		
            // InternalAllocation.g:1637:3: ( ( ruleEString ) )
            // InternalAllocation.g:1638:4: ( ruleEString )
            {
            // InternalAllocation.g:1638:4: ( ruleEString )
            // InternalAllocation.g:1639:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturntypeReturnTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAllocation.g:1653:3: (otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAllocation.g:1654:4: otherlv_5= 'parameter' otherlv_6= '{' ( (lv_parameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getParameterKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalAllocation.g:1662:4: ( (lv_parameter_7_0= ruleParameter ) )
                    // InternalAllocation.g:1663:5: (lv_parameter_7_0= ruleParameter )
                    {
                    // InternalAllocation.g:1663:5: (lv_parameter_7_0= ruleParameter )
                    // InternalAllocation.g:1664:6: lv_parameter_7_0= ruleParameter
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
                    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAllocation.g:1681:4: (otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalAllocation.g:1682:5: otherlv_8= ',' ( (lv_parameter_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalAllocation.g:1686:5: ( (lv_parameter_9_0= ruleParameter ) )
                    	    // InternalAllocation.g:1687:6: (lv_parameter_9_0= ruleParameter )
                    	    {
                    	    // InternalAllocation.g:1687:6: (lv_parameter_9_0= ruleParameter )
                    	    // InternalAllocation.g:1688:7: lv_parameter_9_0= ruleParameter
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
                    	    								"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_7); 

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
    // InternalAllocation.g:1719:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalAllocation.g:1719:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalAllocation.g:1720:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalAllocation.g:1726:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAllocation.g:1732:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalAllocation.g:1733:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalAllocation.g:1733:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalAllocation.g:1734:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'parametertype' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalAllocation.g:1738:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAllocation.g:1739:4: (lv_name_1_0= ruleEString )
            {
            // InternalAllocation.g:1739:4: (lv_name_1_0= ruleEString )
            // InternalAllocation.g:1740:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getParametertypeKeyword_3());
            		
            // InternalAllocation.g:1765:3: ( ( ruleEString ) )
            // InternalAllocation.g:1766:4: ( ruleEString )
            {
            // InternalAllocation.g:1766:4: ( ruleEString )
            // InternalAllocation.g:1767:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getParametertypeParameterTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalAllocation.g:1789:1: entryRuleReturnType_Impl returns [EObject current=null] : iv_ruleReturnType_Impl= ruleReturnType_Impl EOF ;
    public final EObject entryRuleReturnType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnType_Impl = null;


        try {
            // InternalAllocation.g:1789:56: (iv_ruleReturnType_Impl= ruleReturnType_Impl EOF )
            // InternalAllocation.g:1790:2: iv_ruleReturnType_Impl= ruleReturnType_Impl EOF
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
    // InternalAllocation.g:1796:1: ruleReturnType_Impl returns [EObject current=null] : ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleReturnType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalAllocation.g:1802:2: ( ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalAllocation.g:1803:2: ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalAllocation.g:1803:2: ( () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalAllocation.g:1804:3: () otherlv_1= 'ReturnType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalAllocation.g:1804:3: ()
            // InternalAllocation.g:1805:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnType_ImplAccess().getReturnTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnType_ImplAccess().getReturnTypeKeyword_1());
            		
            // InternalAllocation.g:1815:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAllocation.g:1816:4: (lv_name_2_0= ruleEString )
            {
            // InternalAllocation.g:1816:4: (lv_name_2_0= ruleEString )
            // InternalAllocation.g:1817:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
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
    // InternalAllocation.g:1838:1: entryRuleParameterType_Impl returns [EObject current=null] : iv_ruleParameterType_Impl= ruleParameterType_Impl EOF ;
    public final EObject entryRuleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType_Impl = null;


        try {
            // InternalAllocation.g:1838:59: (iv_ruleParameterType_Impl= ruleParameterType_Impl EOF )
            // InternalAllocation.g:1839:2: iv_ruleParameterType_Impl= ruleParameterType_Impl EOF
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
    // InternalAllocation.g:1845:1: ruleParameterType_Impl returns [EObject current=null] : ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalAllocation.g:1851:2: ( ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalAllocation.g:1852:2: ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalAllocation.g:1852:2: ( () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalAllocation.g:1853:3: () otherlv_1= 'ParameterType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalAllocation.g:1853:3: ()
            // InternalAllocation.g:1854:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1());
            		
            // InternalAllocation.g:1864:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAllocation.g:1865:4: (lv_name_2_0= ruleEString )
            {
            // InternalAllocation.g:1865:4: (lv_name_2_0= ruleEString )
            // InternalAllocation.g:1866:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
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
    // InternalAllocation.g:1887:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalAllocation.g:1887:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalAllocation.g:1888:2: iv_ruleSimple= ruleSimple EOF
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
    // InternalAllocation.g:1894:1: ruleSimple returns [EObject current=null] : ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' ) ;
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
            // InternalAllocation.g:1900:2: ( ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' ) )
            // InternalAllocation.g:1901:2: ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' )
            {
            // InternalAllocation.g:1901:2: ( () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}' )
            // InternalAllocation.g:1902:3: () otherlv_1= 'Simple' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )? otherlv_6= '}'
            {
            // InternalAllocation.g:1902:3: ()
            // InternalAllocation.g:1903:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleAccess().getSimpleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleAccess().getSimpleKeyword_1());
            		
            // InternalAllocation.g:1913:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAllocation.g:1914:4: (lv_name_2_0= ruleEString )
            {
            // InternalAllocation.g:1914:4: (lv_name_2_0= ruleEString )
            // InternalAllocation.g:1915:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAllocation.g:1936:3: (otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==50) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAllocation.g:1937:4: otherlv_4= 'kind' ( (lv_kind_5_0= rulesimpleTypes ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimpleAccess().getKindKeyword_4_0());
                    			
                    // InternalAllocation.g:1941:4: ( (lv_kind_5_0= rulesimpleTypes ) )
                    // InternalAllocation.g:1942:5: (lv_kind_5_0= rulesimpleTypes )
                    {
                    // InternalAllocation.g:1942:5: (lv_kind_5_0= rulesimpleTypes )
                    // InternalAllocation.g:1943:6: lv_kind_5_0= rulesimpleTypes
                    {

                    						newCompositeNode(grammarAccess.getSimpleAccess().getKindSimpleTypesEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_kind_5_0=rulesimpleTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_5_0,
                    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.simpleTypes");
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
    // InternalAllocation.g:1969:1: entryRuleComplex returns [EObject current=null] : iv_ruleComplex= ruleComplex EOF ;
    public final EObject entryRuleComplex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplex = null;


        try {
            // InternalAllocation.g:1969:48: (iv_ruleComplex= ruleComplex EOF )
            // InternalAllocation.g:1970:2: iv_ruleComplex= ruleComplex EOF
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
    // InternalAllocation.g:1976:1: ruleComplex returns [EObject current=null] : (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
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
            // InternalAllocation.g:1982:2: ( (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalAllocation.g:1983:2: (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalAllocation.g:1983:2: (otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalAllocation.g:1984:3: otherlv_0= 'Complex' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'simple' otherlv_4= '{' ( (lv_simple_5_0= ruleSimple ) ) (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexAccess().getComplexKeyword_0());
            		
            // InternalAllocation.g:1988:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAllocation.g:1989:4: (lv_name_1_0= ruleEString )
            {
            // InternalAllocation.g:1989:4: (lv_name_1_0= ruleEString )
            // InternalAllocation.g:1990:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexAccess().getSimpleKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAllocation.g:2019:3: ( (lv_simple_5_0= ruleSimple ) )
            // InternalAllocation.g:2020:4: (lv_simple_5_0= ruleSimple )
            {
            // InternalAllocation.g:2020:4: (lv_simple_5_0= ruleSimple )
            // InternalAllocation.g:2021:5: lv_simple_5_0= ruleSimple
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.Simple");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAllocation.g:2038:3: (otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAllocation.g:2039:4: otherlv_6= ',' ( (lv_simple_7_0= ruleSimple ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_36); 

            	    				newLeafNode(otherlv_6, grammarAccess.getComplexAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalAllocation.g:2043:4: ( (lv_simple_7_0= ruleSimple ) )
            	    // InternalAllocation.g:2044:5: (lv_simple_7_0= ruleSimple )
            	    {
            	    // InternalAllocation.g:2044:5: (lv_simple_7_0= ruleSimple )
            	    // InternalAllocation.g:2045:6: lv_simple_7_0= ruleSimple
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
            	    							"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.Simple");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

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
    // InternalAllocation.g:2075:1: entryRuleVoid returns [EObject current=null] : iv_ruleVoid= ruleVoid EOF ;
    public final EObject entryRuleVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoid = null;


        try {
            // InternalAllocation.g:2075:45: (iv_ruleVoid= ruleVoid EOF )
            // InternalAllocation.g:2076:2: iv_ruleVoid= ruleVoid EOF
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
    // InternalAllocation.g:2082:1: ruleVoid returns [EObject current=null] : ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalAllocation.g:2088:2: ( ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalAllocation.g:2089:2: ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalAllocation.g:2089:2: ( () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) ) )
            // InternalAllocation.g:2090:3: () otherlv_1= 'Void' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalAllocation.g:2090:3: ()
            // InternalAllocation.g:2091:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidAccess().getVoidAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidAccess().getVoidKeyword_1());
            		
            // InternalAllocation.g:2101:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAllocation.g:2102:4: (lv_name_2_0= ruleEString )
            {
            // InternalAllocation.g:2102:4: (lv_name_2_0= ruleEString )
            // InternalAllocation.g:2103:5: lv_name_2_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
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


    // $ANTLR start "entryRuleDelegationConnector"
    // InternalAllocation.g:2124:1: entryRuleDelegationConnector returns [EObject current=null] : iv_ruleDelegationConnector= ruleDelegationConnector EOF ;
    public final EObject entryRuleDelegationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegationConnector = null;


        try {
            // InternalAllocation.g:2124:60: (iv_ruleDelegationConnector= ruleDelegationConnector EOF )
            // InternalAllocation.g:2125:2: iv_ruleDelegationConnector= ruleDelegationConnector EOF
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
    // InternalAllocation.g:2131:1: ruleDelegationConnector returns [EObject current=null] : (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
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
            // InternalAllocation.g:2137:2: ( (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalAllocation.g:2138:2: (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalAllocation.g:2138:2: (otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalAllocation.g:2139:3: otherlv_0= 'DelegationConnector' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegationConnectorAccess().getDelegationConnectorKeyword_0());
            		
            // InternalAllocation.g:2143:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAllocation.g:2144:4: (lv_name_1_0= ruleEString )
            {
            // InternalAllocation.g:2144:4: (lv_name_1_0= ruleEString )
            // InternalAllocation.g:2145:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getDelegationConnectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getDelegationConnectorAccess().getRoleKeyword_3());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getDelegationConnectorAccess().getLeftParenthesisKeyword_4());
            		
            // InternalAllocation.g:2174:3: ( ( ruleEString ) )
            // InternalAllocation.g:2175:4: ( ruleEString )
            {
            // InternalAllocation.g:2175:4: ( ruleEString )
            // InternalAllocation.g:2176:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelegationConnectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAllocation.g:2190:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==14) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAllocation.g:2191:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDelegationConnectorAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalAllocation.g:2195:4: ( ( ruleEString ) )
            	    // InternalAllocation.g:2196:5: ( ruleEString )
            	    {
            	    // InternalAllocation.g:2196:5: ( ruleEString )
            	    // InternalAllocation.g:2197:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDelegationConnectorRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDelegationConnectorAccess().getRoleRoleCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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

            otherlv_8=(Token)match(input,31,FOLLOW_7); 

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
    // InternalAllocation.g:2224:1: entryRuleRole_Impl returns [EObject current=null] : iv_ruleRole_Impl= ruleRole_Impl EOF ;
    public final EObject entryRuleRole_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole_Impl = null;


        try {
            // InternalAllocation.g:2224:50: (iv_ruleRole_Impl= ruleRole_Impl EOF )
            // InternalAllocation.g:2225:2: iv_ruleRole_Impl= ruleRole_Impl EOF
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
    // InternalAllocation.g:2231:1: ruleRole_Impl returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRole_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAllocation.g:2237:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalAllocation.g:2238:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalAllocation.g:2238:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalAllocation.g:2239:3: otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'interface' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRole_ImplAccess().getRoleKeyword_0());
            		
            // InternalAllocation.g:2243:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAllocation.g:2244:4: (lv_name_1_0= ruleEString )
            {
            // InternalAllocation.g:2244:4: (lv_name_1_0= ruleEString )
            // InternalAllocation.g:2245:5: lv_name_1_0= ruleEString
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
            						"edu.kit.ipd.sdq.mdsdpc.allocation.Allocation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getRole_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRole_ImplAccess().getInterfaceKeyword_3());
            		
            // InternalAllocation.g:2270:3: ( ( ruleEString ) )
            // InternalAllocation.g:2271:4: ( ruleEString )
            {
            // InternalAllocation.g:2271:4: ( ruleEString )
            // InternalAllocation.g:2272:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRole_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRole_ImplAccess().getInterfaceInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalAllocation.g:2294:1: rulesimpleTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) ) ;
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
            // InternalAllocation.g:2300:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) ) )
            // InternalAllocation.g:2301:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) )
            {
            // InternalAllocation.g:2301:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'list' ) | (enumLiteral_7= 'long' ) | (enumLiteral_8= 'map' ) | (enumLiteral_9= 'string' ) )
            int alt28=10;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt28=1;
                }
                break;
            case 58:
                {
                alt28=2;
                }
                break;
            case 59:
                {
                alt28=3;
                }
                break;
            case 60:
                {
                alt28=4;
                }
                break;
            case 61:
                {
                alt28=5;
                }
                break;
            case 62:
                {
                alt28=6;
                }
                break;
            case 63:
                {
                alt28=7;
                }
                break;
            case 64:
                {
                alt28=8;
                }
                break;
            case 65:
                {
                alt28=9;
                }
                break;
            case 66:
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
                    // InternalAllocation.g:2302:3: (enumLiteral_0= 'int' )
                    {
                    // InternalAllocation.g:2302:3: (enumLiteral_0= 'int' )
                    // InternalAllocation.g:2303:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypesAccess().getIntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAllocation.g:2310:3: (enumLiteral_1= 'boolean' )
                    {
                    // InternalAllocation.g:2310:3: (enumLiteral_1= 'boolean' )
                    // InternalAllocation.g:2311:4: enumLiteral_1= 'boolean'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypesAccess().getBooleanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAllocation.g:2318:3: (enumLiteral_2= 'char' )
                    {
                    // InternalAllocation.g:2318:3: (enumLiteral_2= 'char' )
                    // InternalAllocation.g:2319:4: enumLiteral_2= 'char'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypesAccess().getCharEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAllocation.g:2326:3: (enumLiteral_3= 'date' )
                    {
                    // InternalAllocation.g:2326:3: (enumLiteral_3= 'date' )
                    // InternalAllocation.g:2327:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypesAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAllocation.g:2334:3: (enumLiteral_4= 'double' )
                    {
                    // InternalAllocation.g:2334:3: (enumLiteral_4= 'double' )
                    // InternalAllocation.g:2335:4: enumLiteral_4= 'double'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimpleTypesAccess().getDoubleEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAllocation.g:2342:3: (enumLiteral_5= 'float' )
                    {
                    // InternalAllocation.g:2342:3: (enumLiteral_5= 'float' )
                    // InternalAllocation.g:2343:4: enumLiteral_5= 'float'
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSimpleTypesAccess().getFloatEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAllocation.g:2350:3: (enumLiteral_6= 'list' )
                    {
                    // InternalAllocation.g:2350:3: (enumLiteral_6= 'list' )
                    // InternalAllocation.g:2351:4: enumLiteral_6= 'list'
                    {
                    enumLiteral_6=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSimpleTypesAccess().getListEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAllocation.g:2358:3: (enumLiteral_7= 'long' )
                    {
                    // InternalAllocation.g:2358:3: (enumLiteral_7= 'long' )
                    // InternalAllocation.g:2359:4: enumLiteral_7= 'long'
                    {
                    enumLiteral_7=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSimpleTypesAccess().getLongEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalAllocation.g:2366:3: (enumLiteral_8= 'map' )
                    {
                    // InternalAllocation.g:2366:3: (enumLiteral_8= 'map' )
                    // InternalAllocation.g:2367:4: enumLiteral_8= 'map'
                    {
                    enumLiteral_8=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getSimpleTypesAccess().getMapEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalAllocation.g:2374:3: (enumLiteral_9= 'string' )
                    {
                    // InternalAllocation.g:2374:3: (enumLiteral_9= 'string' )
                    // InternalAllocation.g:2375:4: enumLiteral_9= 'string'
                    {
                    enumLiteral_9=(Token)match(input,66,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xFE00000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000000000L});

}