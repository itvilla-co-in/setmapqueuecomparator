package objectcompare;

import java.util.Arrays;

public class arraysort {

	public static void main(String[] args) {
		 Integer[] empid = new Integer[] {3,6,1,7,2,8,3};
		 String[] empname = new String[] {"empname200","ampname5","empname1","empname8","empname7"};
		 Arrays.sort(empid);
		
		 System.out.println("Sorted Integer");
		 for(Integer temp1: empid){
				System.out.println(temp1);
			}
		 
		 System.out.println("Sorted String");
		 Arrays.sort(empname);
		 for(String temp2: empname){
				System.out.println(temp2);
			}
	
	
	
	
	}

}
