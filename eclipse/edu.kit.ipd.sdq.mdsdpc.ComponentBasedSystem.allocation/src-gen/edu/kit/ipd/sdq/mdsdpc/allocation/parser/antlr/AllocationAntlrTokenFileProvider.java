/*
 * generated by Xtext 2.9.1
 */
package edu.kit.ipd.sdq.mdsdpc.allocation.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AllocationAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("edu/kit/ipd/sdq/mdsdpc/allocation/parser/antlr/internal/InternalAllocation.tokens");
	}
}
