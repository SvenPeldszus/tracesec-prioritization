/*
 * generated by Xtext 2.25.0
 */
package org.tracesec.graph.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GraphConfigurationAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/tracesec/graph/dsl/parser/antlr/internal/InternalGraphConfiguration.tokens");
	}
}