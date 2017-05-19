package sheet3ControlFlow;
import java.util.Scanner;
public class Ex9IfElseStatements
{
	public static void main(String [] args)
	{
		double value = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a value: ");
		value = input.nextDouble();
		System.out.println(value);
		
		if(value >= 1 && value <= 10)
		{
			System.out.println("The value is between 1 and 10");
		}
		else if(value >= 11 && value <= 20)
		{
			System.out.println("The value is between 11 and 20");
		}
		else if(value >= 21 && value <=30)
		{
			System.out.println("The value is between 21 and 30");
		}
		else if(value >= 31 && value <= 40)
		{
			System.out.println("The value is between 31 and 40");
		}
		else if(value >= 41 && value <= 50)
		{
			System.out.println("The value is between 41 and 50");
		}
		else
		{
			System.out.println("The value is over 50");
		}
		input.close();
	}
	
}