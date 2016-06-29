/*
 * generated by Xtext 2.9.1
 */
grammar InternalEnvironment;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package edu.kit.ipd.sdq.mdsdpc.environment.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package edu.kit.ipd.sdq.mdsdpc.environment.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.kit.ipd.sdq.mdsdpc.environment.services.EnvironmentGrammarAccess;

}

@parser::members {

 	private EnvironmentGrammarAccess grammarAccess;

    public InternalEnvironmentParser(TokenStream input, EnvironmentGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Environment";
   	}

   	@Override
   	protected EnvironmentGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleEnvironment
entryRuleEnvironment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnvironmentRule()); }
	iv_ruleEnvironment=ruleEnvironment
	{ $current=$iv_ruleEnvironment.current; }
	EOF;

// Rule Environment
ruleEnvironment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
					$current);
			}
		)
		otherlv_1='Environment'
		{
			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='container'
			{
				newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getContainerKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEnvironmentAccess().getContainerContainerParserRuleCall_3_2_0());
					}
					lv_container_5_0=ruleContainer
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnvironmentRule());
						}
						add(
							$current,
							"container",
							lv_container_5_0,
							"edu.kit.ipd.sdq.mdsdpc.environment.Environment.Container");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEnvironmentAccess().getContainerContainerParserRuleCall_3_3_1_0());
						}
						lv_container_7_0=ruleContainer
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEnvironmentRule());
							}
							add(
								$current,
								"container",
								lv_container_7_0,
								"edu.kit.ipd.sdq.mdsdpc.environment.Environment.Container");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		(
			otherlv_9='link'
			{
				newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getLinkKeyword_4_0());
			}
			otherlv_10='{'
			{
				newLeafNode(otherlv_10, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEnvironmentAccess().getLinkLinkParserRuleCall_4_2_0());
					}
					lv_link_11_0=ruleLink
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnvironmentRule());
						}
						add(
							$current,
							"link",
							lv_link_11_0,
							"edu.kit.ipd.sdq.mdsdpc.environment.Environment.Link");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getEnvironmentAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEnvironmentAccess().getLinkLinkParserRuleCall_4_3_1_0());
						}
						lv_link_13_0=ruleLink
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEnvironmentRule());
							}
							add(
								$current,
								"link",
								lv_link_13_0,
								"edu.kit.ipd.sdq.mdsdpc.environment.Environment.Link");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14='}'
			{
				newLeafNode(otherlv_14, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleContainer
entryRuleContainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainerRule()); }
	iv_ruleContainer=ruleContainer
	{ $current=$iv_ruleContainer.current; }
	EOF;

// Rule Container
ruleContainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getContainerAccess().getContainerAction_0(),
					$current);
			}
		)
		otherlv_1='Container'
		{
			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContainerRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"edu.kit.ipd.sdq.mdsdpc.environment.Environment.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLink
entryRuleLink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLinkRule()); }
	iv_ruleLink=ruleLink
	{ $current=$iv_ruleLink.current; }
	EOF;

// Rule Link
ruleLink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Link'
		{
			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLinkAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLinkRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"edu.kit.ipd.sdq.mdsdpc.environment.Environment.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='container'
		{
			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getContainerKeyword_3());
		}
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLinkRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getLinkAccess().getContainerContainerCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLinkRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getLinkAccess().getContainerContainerCrossReference_6_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getRightParenthesisKeyword_7());
		}
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
