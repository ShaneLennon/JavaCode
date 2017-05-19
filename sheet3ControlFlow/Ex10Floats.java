package sheet3ControlFlow;

import java.util.concurrent.SynchronousQueue;

public class Ex10Floats 
{
	public static void main(String [] args)
	{
		Ex10Floats m = new Ex10Floats();
		float num1 = 6;
		float num2 = 6;
		float num3 = 7;

		m.differentOrSame(num1, num2, num3);
		m.largestAndSmallest(num1, num2, num3);
		m.average(num1, num2, num3);
	}

	public void differentOrSame(float num1, float num2, float num3)
	{
		if(num1 != num2 && num2 != num3)
		{
			System.out.println("The numbers are all different");
		}

		else if(num1 == num2 || num2 == num3 || num1 == num3)
		{
			System.out.println("Two or more numbers are the same");
		}
	}
	
	public void largestAndSmallest(float num1, float num2, float num3)
	{
		float largest = num1;
		
		if(num2 > largest)
		{
			largest = num2;
		}
		if(num3 > largest)
		{
			largest = num3;
		}
		System.out.println("The largest is "+largest);
		
		float smallest = num1;
		
		if(num2 < smallest)
		{
			smallest = num2;
		}
		if(num3 < smallest)
		{
			smallest = num3;
		}
		System.out.println("The smallest is "+smallest);
		
	}
	
	public void average(float num1, float num2, float num3)
	{
		float average = (num1+num2+num3)/3;
		System.out.printf("The average is %.3f",average);
	
	}
}
