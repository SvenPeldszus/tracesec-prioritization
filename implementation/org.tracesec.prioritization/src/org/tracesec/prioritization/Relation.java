package org.tracesec.prioritization;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class Relation {

	private final EObject src;
	private final EReference reference;
	private final Collection<EObject> trg;

	public Relation(final EObject src, final EReference reference) {
		this.src = src;
		this.reference = reference;
		this.trg = getValueAsCollection(src, reference);
	}

	@SuppressWarnings("unchecked")
	public static Collection<EObject> getValueAsCollection(final EObject src, final EReference reference) {
		try{
			final var value = src.eGet(reference);
			if (value == null) {
				return Collections.emptyList();
			}
			if (value instanceof Collection) {
				return (Collection<EObject>) value;
			}
			if (value instanceof EObject) {
				return Collections.singleton((EObject) value);
			}
		}
		catch(final NullPointerException e) {
			return Collections.emptyList();
		}
		throw new IllegalStateException();
	}

	public EObject getSrc() {
		return this.src;
	}

	public EReference getReference() {
		return this.reference;
	}

	public Collection<EObject> getTrg() {
		return this.trg;
	}

	@Override
	public int hashCode() {
		var hash = this.src.hashCode() & this.reference.hashCode();
		for (final EObject t : this.trg) {
			hash &= t.hashCode();
		}
		return hash;
	}

	@Override
	public boolean equals(final Object obj) {
		if (!(obj instanceof Relation)) {
			return false;
		}
		final var other = (Relation) obj;
		if (!this.src.equals(other.src)) {
			return false;
		}
		if (!this.reference.equals(other.reference)) {
			return false;
		}
		if (this.trg.size() != other.trg.size()) {
			return false;
		}
		return this.trg.containsAll(other.trg);
	}

	@Override
	public String toString() {
		return super.toString() + '(' + this.src.eClass().getName() + " --" + this.reference.getName() + "--> ["
				+ this.trg.stream().map(t -> t.eClass().getName()).collect(Collectors.joining(", ")) + "])";
	}
}
