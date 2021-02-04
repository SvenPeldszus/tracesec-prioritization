package org.tracesec.qualitymodel.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;
import org.tracesec.qualitymodel.QualityAspect;
import org.tracesec.qualitymodel.QualityCategory;
import org.tracesec.qualitymodel.QualityModelPackage;

public class ModelTests {

	@Test
	public void testChildReference(){
		final ResourceSet set = initRS();

		final Resource resource = set.getResource(URI.createFileURI("instances/qm.xmi"), true);
		final QualityCategory root = (QualityCategory) resource.getContents().get(0);
		assertTrue(root.getOwnedNodes().containsAll(root.getAspects()));
		assertTrue(root.getOwnedNodes().containsAll(root.getSubcategories()));
	}

	@Test
	public void testOwnerReference(){
		final ResourceSet set = initRS();

		final Resource resource = set.getResource(URI.createFileURI("instances/qm.xmi"), true);
		final QualityCategory root = (QualityCategory) resource.getContents().get(0);
		assertEquals(root, root.getAspects().get(0).getOwner());
		assertEquals(root, root.getSubcategories().get(0).getOwner());
	}


	@Test
	public void changeOwnerReferenceViaSetOwnwer(){
		final ResourceSet set = initRS();

		final Resource resource = set.getResource(URI.createFileURI("instances/qm.xmi"), true);
		final QualityCategory root = (QualityCategory) resource.getContents().get(0);
		final QualityAspect aspect = root.getAspects().get(0);
		final QualityCategory category = root.getSubcategories().get(0);
		aspect.setOwner(category);
		assertEquals(category, aspect.getOwner());
		assertTrue(category.getAspects().contains(aspect));
		assertTrue(category.getOwnedNodes().contains(aspect));
	}

	@Test
	public void changeOwnerReferenceViaAddToAspects(){
		final ResourceSet set = initRS();

		final Resource resource = set.getResource(URI.createFileURI("instances/qm.xmi"), true);
		final QualityCategory root = (QualityCategory) resource.getContents().get(0);
		final QualityAspect aspect = root.getAspects().get(0);
		final QualityCategory category = root.getSubcategories().get(0);
		category.getAspects().add(aspect);
		assertEquals(category, aspect.getOwner());
		assertTrue(category.getAspects().contains(aspect));
		assertTrue(category.getOwnedNodes().contains(aspect));
	}

	public ResourceSet initRS() {
		final ResourceSet set = new ResourceSetImpl();
		set.getPackageRegistry().put(QualityModelPackage.eNS_URI, QualityModelPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		return set;
	}
}
