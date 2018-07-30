package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class myset1 {
	 
	public static void main(String args[]) { 
	     int temp[] = {100, 200,300,400,50,500,500};
	     
	     Set<Integer> myset = new HashSet<Integer>();
	    
	     try{
	       
	    	 for(int i = 0; i<temp.length; i++)
	    	 {
	           myset.add(temp[i]);
	         }
	        System.out.println(" Lets see what is in the set " + myset);        

	        myset.remove(200);        
	        System.out.println("Values after delete=" + myset);

	        System.out.println(" How to get values of set with iterating over entire set");        
	        
	        Iterator<Integer> iterator1 = myset.iterator();
	        
	        while(iterator1.hasNext()){
	        	System.out.println(iterator1.next());
	        }     

	     }
	     catch(Exception e){}
	  }

}
