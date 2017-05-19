package sheet3ControlFlow;
import java.util.Scanner;
public class Ex7TotalOfTenValues
{
	public static void main(String [] args)
	{
		double total=0;
		double j = 0;
		
		
		/*for(int i = 0; i < 10; i++)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter an integer : ");
			int a = input.nextInt();
			total = total+a;
			System.out.println("You entered "+a);
			j++;
		}
		double average = total/j;
		System.out.println("j is "+j);
		System.out.println("The sum of the numbers entered is "+total);
		System.out.println("The average of the numbers entered is "+average);
		*/
		
		int i = 0;
		while(i < 10)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			double a = input.nextDouble();
			total = total+a;
			System.out.println("You entered "+a);
			i++;
		}
		System.out.println("i is "+i);
		System.out.println("The sum of the numbers entered is "+total);
		System.out.println("The average of the numbers entered is "+total/i);
		
	}
}