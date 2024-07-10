import java.util.Random;

public class FindingPrio implements Comparable<FindingPrio> {
	private int id;
	private int prio;
	private int rand;
	private Random random = new Random();
	
	public FindingPrio(int id, int prio) {
		this.id = id;
		this.prio = prio;
		this.rand = random.nextInt();
	}
	
	public int getID() {
		return id;
	}
	
	public int getPrio() {
		return prio;
	}
	
	public void rerand() {
		this.rand = random.nextInt();
	}
	
	
	@Override
	public int compareTo(FindingPrio other) {
	    int result = Integer.compare(this.prio, other.prio);
	    if (result == 0) {
	    	result = Integer.compare(this.rand, other.rand);
	    }
	    return result;
	}

	@Override
	public String toString() {
		return "(" + this.id + ", " + this.prio + ")";
	}
}
