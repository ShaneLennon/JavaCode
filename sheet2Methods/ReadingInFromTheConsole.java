package sheet2Methods;
import java.util.Scanner;
public class ReadingInFromTheConsole {
	public static void main(String[] args) {
		
		/* 
		 * This creates an instance of the Scanner class and 
		 * links it up to the console window, so that we can 
		 * read in values from the console that the user has 
		 * typed.
		 */
		Scanner input = new Scanner(System.in);
		
		ReadingInFromTheConsole m = new ReadingInFromTheConsole();
		
		// Prompt the user
		System.out.print("Please enter a number: ");
		double num1 = input.nextDouble();   // double num = input.nextDouble();
		System.out.print("Please enter a second number: ");
		double num2 = input.nextDouble();
		System.out.print("Please enter a third number: ");
		double num3 = input.nextDouble();
		
		double total = m.getTotal(num1,num2,num3);
		
		System.out.printf("Total of %.0f, %.0f, and %.0f is %.0f  ",num1, num2, num3,total);
		// Close the scanner object at the end of main
		input.close();
	}
	public double getTotal(double num1, double num2,double num3)
	{
		double total = num1+num2+num3;
		return total;
	}
}