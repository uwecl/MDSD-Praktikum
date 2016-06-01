/*
 * generated by Xtext 2.9.1
 */
package edu.kit.ipd.sdq.mdsdpc.environment.parser.antlr;

import com.google.inject.Inject;
import edu.kit.ipd.sdq.mdsdpc.environment.parser.antlr.internal.InternalEnvironmentParser;
import edu.kit.ipd.sdq.mdsdpc.environment.services.EnvironmentGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class EnvironmentParser extends AbstractAntlrParser {

	@Inject
	private EnvironmentGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEnvironmentParser createParser(XtextTokenStream stream) {
		return new InternalEnvironmentParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Environment";
	}

	public EnvironmentGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EnvironmentGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
