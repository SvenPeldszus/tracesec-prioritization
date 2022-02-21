/*
 * generated by Xtext 2.25.0
 */
package org.tracesec.graph.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.tracesec.graph.dsl.ide.contentassist.antlr.internal.InternalGraphConfigurationParser;
import org.tracesec.graph.dsl.services.GraphConfigurationGrammarAccess;

public class GraphConfigurationParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(GraphConfigurationGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, GraphConfigurationGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getWeightAccess().getAlternatives(), "rule__Weight__Alternatives");
			builder.put(grammarAccess.getConsiderAccess().getAlternatives(), "rule__Consider__Alternatives");
			builder.put(grammarAccess.getDirectionAccess().getAlternatives(), "rule__Direction__Alternatives");
			builder.put(grammarAccess.getConfigurationAccess().getGroup(), "rule__Configuration__Group__0");
			builder.put(grammarAccess.getConfigurationAccess().getGroup_0(), "rule__Configuration__Group_0__0");
			builder.put(grammarAccess.getConfigurationAccess().getGroup_1(), "rule__Configuration__Group_1__0");
			builder.put(grammarAccess.getNamespaceAccess().getGroup(), "rule__Namespace__Group__0");
			builder.put(grammarAccess.getNamespaceAccess().getGroup_3(), "rule__Namespace__Group_3__0");
			builder.put(grammarAccess.getNamespaceAccess().getGroup_4(), "rule__Namespace__Group_4__0");
			builder.put(grammarAccess.getNamespaceAccess().getGroup_5(), "rule__Namespace__Group_5__0");
			builder.put(grammarAccess.getNamespaceAccess().getGroup_6(), "rule__Namespace__Group_6__0");
			builder.put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_3(), "rule__Type__Group_3__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_4(), "rule__Type__Group_4__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_5(), "rule__Type__Group_5__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_6(), "rule__Type__Group_6__0");
			builder.put(grammarAccess.getEdgeAccess().getGroup(), "rule__Edge__Group__0");
			builder.put(grammarAccess.getEdgeAccess().getGroup_2(), "rule__Edge__Group_2__0");
			builder.put(grammarAccess.getEdgeAccess().getGroup_2_2(), "rule__Edge__Group_2_2__0");
			builder.put(grammarAccess.getConfigurationAccess().getDefaultAssignment_0_2(), "rule__Configuration__DefaultAssignment_0_2");
			builder.put(grammarAccess.getConfigurationAccess().getConsiderAssignment_1_2(), "rule__Configuration__ConsiderAssignment_1_2");
			builder.put(grammarAccess.getConfigurationAccess().getNamespacesAssignment_2(), "rule__Configuration__NamespacesAssignment_2");
			builder.put(grammarAccess.getNamespaceAccess().getPackageAssignment_1(), "rule__Namespace__PackageAssignment_1");
			builder.put(grammarAccess.getNamespaceAccess().getDefaultAssignment_3_2(), "rule__Namespace__DefaultAssignment_3_2");
			builder.put(grammarAccess.getNamespaceAccess().getConsiderAssignment_4_2(), "rule__Namespace__ConsiderAssignment_4_2");
			builder.put(grammarAccess.getNamespaceAccess().getIncludeAssignment_5_2(), "rule__Namespace__IncludeAssignment_5_2");
			builder.put(grammarAccess.getNamespaceAccess().getExcludeAssignment_6_2(), "rule__Namespace__ExcludeAssignment_6_2");
			builder.put(grammarAccess.getTypeAccess().getTypeAssignment_1(), "rule__Type__TypeAssignment_1");
			builder.put(grammarAccess.getTypeAccess().getConsiderAssignment_3_2(), "rule__Type__ConsiderAssignment_3_2");
			builder.put(grammarAccess.getTypeAccess().getDefaultAssignment_4_2(), "rule__Type__DefaultAssignment_4_2");
			builder.put(grammarAccess.getTypeAccess().getInlcudeAssignment_5_2(), "rule__Type__InlcudeAssignment_5_2");
			builder.put(grammarAccess.getTypeAccess().getExcludeAssignment_6_2(), "rule__Type__ExcludeAssignment_6_2");
			builder.put(grammarAccess.getEdgeAccess().getReferenceAssignment_1(), "rule__Edge__ReferenceAssignment_1");
			builder.put(grammarAccess.getEdgeAccess().getTypeAssignment_2_1(), "rule__Edge__TypeAssignment_2_1");
			builder.put(grammarAccess.getEdgeAccess().getTargetAssignment_2_2_1(), "rule__Edge__TargetAssignment_2_2_1");
			builder.put(grammarAccess.getEdgeAccess().getDirectionAssignment_3(), "rule__Edge__DirectionAssignment_3");
			builder.put(grammarAccess.getEdgeAccess().getWeightAssignment_4(), "rule__Edge__WeightAssignment_4");
			builder.put(grammarAccess.getNumberWeightAccess().getValueAssignment(), "rule__NumberWeight__ValueAssignment");
			builder.put(grammarAccess.getAttributeWeightAccess().getValueAssignment(), "rule__AttributeWeight__ValueAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private GraphConfigurationGrammarAccess grammarAccess;

	@Override
	protected InternalGraphConfigurationParser createParser() {
		InternalGraphConfigurationParser result = new InternalGraphConfigurationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GraphConfigurationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GraphConfigurationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
