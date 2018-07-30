package set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class treeset {
	public static void main(String args[]) {
		
		int count[] = { 100, 200, 150, 99, 500, 250,600, 150};
		
		Set<Integer> set = new TreeSet<Integer>();
		
		String s1="1";
		
		
		try {
			for (int i = 0; i < count.length; i++) {
				set.add(count[i]);
			}
			
			System.out.println("Intial Set:" + set);

			set.remove(500);
			System.out.println("After delete:" + set);

			System.out.println("iterating ");
			
			Iterator<Integer> iterator = set.iterator();
			
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		} catch (Exception e) {
		}
	}
	
}
