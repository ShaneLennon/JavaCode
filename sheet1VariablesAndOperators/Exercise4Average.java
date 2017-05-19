package sheet1VariablesAndOperators;
public class Exercise4Average
{
	public static void main(String [] args)
	{
		double x = 1.25;
		double y = 2.65;
		double z = 22.65;
		double total = x+y+z;
		double average = (x+y+z)/3;
		
		System.out.printf("The total of these numbers is: %.2f\n",total);
		System.out.printf("The average of these numbers is: %.2f",average);
	}
}
