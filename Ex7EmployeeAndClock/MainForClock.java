package Ex7EmployeeAndClock;

import java.util.concurrent.SynchronousQueue;

public class MainForClock {

	public static void main(String[] args) 
	{
		Clock c1 = new Clock(0,0,0);
		System.out.println(c1);
		
		c1.setCompleteTime(22, 59, 59);
		System.out.println(c1);
		
		c1.incrementHours(25);
		System.out.println(c1);
		
		c1.incrementHours(50);
		System.out.println(c1);
		
		c1.incrementMinutes(25);
		System.out.println(c1);
		
		c1.incrementSeconds(40);
		System.out.println(c1);
		
		c1.incrementSeconds(150);
		System.out.println(c1);
		
		c1.incrementHours(25);
		System.out.println(c1);
		
		c1.incrementHours(52);
		System.out.println(c1);
		//int hours = 49;
		//int divisor = 25/24;
		//System.out.println(divisor);
	}
	

}
