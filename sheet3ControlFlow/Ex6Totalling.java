package sheet3ControlFlow;
import java.util.Scanner;
public class Ex6Totalling
{
	public static void main(String [] args)
	{
		int total=0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		int a = input.nextInt();
		total = total+a;
		System.out.println("Total is "+total);
		
		System.out.print("Enter a second integer : ");
		a = input.nextInt();
		total = total+a;
		System.out.println("Total is "+total);
		
		System.out.print("Enter a third integer : ");
		a = input.nextInt();
		total = total+a;
		System.out.println("Total is "+total);
	}
}