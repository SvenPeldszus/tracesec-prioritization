package org.tracesec.prioritization.graph;

public class ResidualEdge {

	private final ResidualNode src;
	private final ResidualNode trg;

	private long visited;

	private int capacity;
	private int usedCapacity;
	private ResidualEdge opposite;

	public ResidualEdge(final ResidualNode src, final ResidualNode trg, final int capacity) {
		this.src = src;
		this.src.addOut(this);
		this.trg = trg;
		this.capacity = capacity;
		this.usedCapacity = 0;
		this.visited = 0;
	}

	public int useCapacity(final int amount) {
		if ((this.capacity - this.usedCapacity) >= amount) {
			this.usedCapacity += amount;
			return this.capacity - this.usedCapacity;
		}
		throw new IllegalArgumentException("Trying to use more capacity than available");
	}

	public void visit(final long time) {
		this.visited = time;
	}

	public ResidualNode getSrc() {
		return this.src;
	}

	public boolean notSeen(final long time) {
		return this.visited != time;
	}

	public ResidualNode getTrg() {
		return this.trg;
	}

	public int getRemainingCapacity() {
		return this.capacity - this.usedCapacity;
	}

	public int getUsedCapacity() {
		return this.usedCapacity;
	}

	public void addCapacity(final int amount) {
		this.capacity += amount;
	}

	@Override
	public String toString() {
		return this.src.getId() +"--("+this.usedCapacity+'/'+this.capacity+")-->"+this.trg.getId();
	}

	public boolean hasCapacity() {
		return this.usedCapacity < this.capacity;
	}

	public ResidualEdge getOppisite() {
		return this.opposite;
	}

	public ResidualEdge setOpposite(final ResidualEdge opposite) {
		if(this.opposite != null) {
			if(!opposite.equals(this.opposite)) {
				final var old = this.opposite;
				old.setOpposite(null);
				this.opposite = opposite;
				this.opposite.setOpposite(this);
				return old;
			}
			return null;
		}
		else {
			this.opposite = opposite;
			if(opposite!=null) {
				opposite.setOpposite(this);
			}
		}
		return null;
	}

	public void augmentCapacity(final int amount) {
		this.capacity = (this.capacity + amount) - this.usedCapacity;
		this.usedCapacity = 0;
	}
}
