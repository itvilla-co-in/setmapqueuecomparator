package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue 
{

	public static void main(String[] args)
	{
	Queue<Integer>  myq= new LinkedList<>();
	myq.add(1);
	myq.add(2);
	myq.add(3);
	myq.add(4);
	myq.add(5);
	
	System.out.println("Lets display size of queue = " + myq.size());
	
	System.out.println("Lets peek in q = " + myq.peek());
	
	System.out.println("Lets poll in q = " + myq.poll());;
	
	System.out.println("Polling will remove after polling. lets see the size " + myq.size());
	
	System.out.println("Lets remove from q = " + myq.remove());;
	
	System.out.println(" lets see the size after q = " + myq.size());
	
	}
}