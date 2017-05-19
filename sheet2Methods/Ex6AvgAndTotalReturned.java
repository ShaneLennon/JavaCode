package sheet2Methods;

public class Ex6AvgAndTotalReturned
{
	public static void main(String [] args)
	{
		Ex6AvgAndTotalReturned m = new Ex6AvgAndTotalReturned();
		
		double num1 = 10.6;
		double num2 = 2.2;
		int num3 = 9;
		
		double average = m.getAverage(num1,num2,num3);
		double total = m.getTotal(num1,num2,num3);
		double doubleNumber = m.doubleMyNumber(num1);
		
		System.out.printf("The average of the three numbers is %.2f\n",average);
		System.out.printf("The total of the three numbers is %.2f\n", total);
		System.out.printf("Double my number %.2f",doubleNumber);
	}
	
	public double getAverage(double a, double b, int c)
	{
		double average = (a+b+c)/3;
		return average;
	}
	
	public double getTotal(double a, double b, int c)
	{
		double total = a+b+c;
		return total;
	}
	
	public double doubleMyNumber(double number)
	{
		double result;
		result = number*2;
		return result;
	}
}