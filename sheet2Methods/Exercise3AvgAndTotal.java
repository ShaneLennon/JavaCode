package sheet2Methods;
public class Exercise3AvgAndTotal
{
	public static void main(String [] args)
	{
		Exercise3AvgAndTotal m = new Exercise3AvgAndTotal();
		
		double num1 = 100.6;
		double num2 = 276.6;
		int num3 = 39;
		m.getAverage(num1,num2,num3);
		m.getTotal(num1,num2,num3);
		
	}
	
	public void getAverage(double a, double b, int c)
	{
		double average = (a + b + c)/3;
		System.out.printf("Average is  %.2f ",average);
	}
	
	public void getTotal(double a, double b, int c)
	{
		double total = a+b+c;
		System.out.printf("Total is %.2f ",total);
	}
	
	
	
}