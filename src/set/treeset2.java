package set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class treeset2 {
	public static void main(String args[]) {
		
		Set<emp3> set = new TreeSet<emp3>();
		
		try {
			set.add(new emp3(1,"empname1","IT"));
			set.add(new emp3(2,"empname2","IT"));
			set.add(new emp3(3,"empname3","IT"));
			set.add(new emp3(1,"empname1","IT"));
			set.add(new emp3(4,"empname1","IT"));
			
			Iterator<emp3> iterator = set.iterator();
			
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		} catch (Exception e) {
		}
	}
	
}
