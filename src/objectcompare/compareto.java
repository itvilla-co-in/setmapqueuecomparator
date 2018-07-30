package objectcompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class compareto {

	public static void main(String[] args) {
		 
		emp3 e1 = new emp3(1, "empname1", "IT");
		emp3 e2 = new emp3(2, "empname2", "IT");
		emp3 e3 = new emp3(4, "empname4", "IT");
		emp3 e4 = new emp3(8, "empname8", "IT");
		emp3 e5 = new emp3(5, "empname5", "IT");
		
		List<emp3> emplist = new ArrayList<emp3>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);

		Collections.sort(emplist);
		

		 for(emp3 emp: emplist){
				System.out.println(emp);
			}
	
		 
		
	}

}
