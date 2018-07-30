package objectcompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class compatator {

	public static void main(String[] args) {
		 
		emp4 e1 = new emp4(1, "empname1", "IT",1000,35);
		emp4 e2 = new emp4(2, "empname2", "IT",2000,34);
		emp4 e3 = new emp4(4, "empname4", "IT",5000,36);
		emp4 e4 = new emp4(8, "empname8", "IT",7000,37);
		emp4 e5 = new emp4(5, "empname5", "IT",3500,38);
		
		List<emp4> emplist = new ArrayList<emp4>();
		
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		
		empsalComparator esalcomp = new empsalComparator();
		System.out.println("Before sorting");
		
		for(emp4 temp2: emplist){
			System.out.println(temp2);
		}
		
		System.out.println("Lets sort by employee salary After sorting");
		Collections.sort(emplist,esalcomp);
		for(emp4 temp2: emplist){
			System.out.println(temp2);
		}
		 
		
		System.out.println("Lets sort by employee age After sorting");
		empageComparator eagecomp = new empageComparator();
		Collections.sort(emplist,eagecomp);
		for(emp4 temp2: emplist){
			System.out.println(temp2);
		}
		 
		 
		
	}

}
