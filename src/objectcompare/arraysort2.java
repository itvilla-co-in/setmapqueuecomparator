package objectcompare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arraysort2 {

	public static void main(String[] args) {
		
		List<Integer> empid = new ArrayList<Integer>();
		empid.add(3);
		empid.add(6);
		empid.add(1);
		empid.add(7);
		empid.add(8);
		empid.add(3);
		
		Collections.sort(empid);
		
		System.out.println("Sorted Integer List");
		 for(Integer temp1: empid){
				System.out.println(temp1);
			}
		 
		 List<String> empname = new ArrayList<String>();
		 empname.add("empname200");
		 empname.add("zmpname200");
		 empname.add("ampname200");
		 empname.add("ympname200");
		 
		 
		 Collections.sort(empname);
		 
		 
		 System.out.println("Sorted String");
	
		 for(String temp2: empname){
				System.out.println(temp2);
			}
	
	
	
	
	}

}
