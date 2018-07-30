package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.SynchronousQueue;

public class mylset1 {

	 public static void main(String args[]) {
         // LinkedHashSet of String Type
         LinkedHashSet<String> mylset = new LinkedHashSet<String>();

         // Adding elements to the LinkedHashSet
         mylset.add("name1");
         mylset.add("name2");
         mylset.add("name3");
         mylset.add("name4");
         mylset.add("name5");
         mylset.add("name6");
         System.out.println(mylset);

        if(mylset.contains("name1")){
        	System.out.println(" Yes it contains name 1 in set ");
        }
        
        
        Iterator<String> iterator1 = mylset.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
        
    }
	 
}
