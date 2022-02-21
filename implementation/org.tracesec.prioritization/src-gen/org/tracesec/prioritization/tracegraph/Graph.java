/**
 */
package org.tracesec.prioritization.tracegraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.prioritization.tracegraph.Graph#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.tracesec.prioritization.tracegraph.Graph#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see org.tracesec.prioritization.tracegraph.TracegraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.tracesec.prioritization.tracegraph.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.tracesec.prioritization.tracegraph.TracegraphPackage#getGraph_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.tracesec.prioritization.tracegraph.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.tracesec.prioritization.tracegraph.TracegraphPackage#getGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // Graph
