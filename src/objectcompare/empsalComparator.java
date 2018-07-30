package objectcompare;

import java.util.Comparator;

public class empsalComparator implements Comparator<emp4> {

	@Override
	public int compare(emp4 emp1, emp4 emp2) {
	 
		return (emp1.getSal() - emp2.getSal());
	}

}
