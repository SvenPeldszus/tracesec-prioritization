/*
 * generated by Xtext 2.25.0
 */
package org.tracesec.graph.dsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.tracesec.graph.dsl.ui.internal.DslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GraphConfigurationExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(DslActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		DslActivator activator = DslActivator.getInstance();
		return activator != null ? activator.getInjector(DslActivator.ORG_TRACESEC_GRAPH_DSL_GRAPHCONFIGURATION) : null;
	}

}