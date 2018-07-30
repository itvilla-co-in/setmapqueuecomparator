package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map1 
{
	
	 public static void main(String args[])
	   {
	       HashMap<Integer,String> testmap = new HashMap<Integer,String>();
	       testmap.put(101,"Error to invalid studentid");
	       testmap.put(102,"Error to invalid password");
	       testmap.put(103,"Error to invalid username");
	       testmap.put(104,"General Error ");
	 
	          
	       Set< Map.Entry<Integer,String> > set = testmap.entrySet();   
	 
	       for (Entry<Integer, String> temp:set)
	       {
	           System.out.print(temp.getKey()+":");
	           System.out.println(temp.getValue());
	       }
	   }

}
