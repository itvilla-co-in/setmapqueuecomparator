package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.SynchronousQueue;

public class mylseto1 {

	 public static void main(String args[]) {
         // LinkedHashSet of String Type
         LinkedHashSet<emp2> mylset = new LinkedHashSet<emp2>();
         	
         // 
         emp2 e1 = new emp2("emp1","1","IT");
         emp2 e2 = new emp2("emp2","2","IT");
         emp2 e3 = new emp2("emp2","2","IT");
         
         // Adding elements to the LinkedHashSet
         mylset.add(e1);
         mylset.add(e2);
         mylset.add(e3);
         
         System.out.println(mylset);

        System.out.println("Looping collection ");
        Iterator<emp2> iterator1 = mylset.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
    }
	 
}
