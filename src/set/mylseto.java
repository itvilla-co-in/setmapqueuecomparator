package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.SynchronousQueue;

public class mylseto {

	 public static void main(String args[]) {
         // LinkedHashSet of String Type
         LinkedHashSet<emp> mylset = new LinkedHashSet<emp>();
         	
         // 
         emp e1 = new emp("emp1","1","IT");
         emp e2 = new emp("emp2","2","IT");
         emp e3 = new emp("emp2","2","IT");
         
         // Adding elements to the LinkedHashSet
         mylset.add(e1);
         mylset.add(e2);
         mylset.add(e3);
         
         System.out.println(mylset);

        System.out.println("Looping collection ");
        Iterator<emp> iterator1 = mylset.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
    }
	 
}
