import java.util.Comparator;

public class FindingPrioIDComparator implements Comparator<FindingPrio> {
	@Override
    public int compare(FindingPrio first, FindingPrio second) {
       return Integer.compare(first.getID(), second.getID());
    }
}
