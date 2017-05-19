package sheet4Arrays;

public class Ex4ArrayOfPrices
{
	public static void main(String [] args)
	{
		double [] prices = {12.50, 11.20, 10.90, 4.99, 5.66, 25.40, 14.30, 33, 24.50, 1.25, 2.20, 3.48};
		
		double [] priceIncrease = new double[12];
		
		for(int i = 0; i < 12; i++)
		{
			priceIncrease[i] = prices[i]*1.04;
		}
		
		System.out.println("Old Price\t New Price");
		
		for(int i = 0; i < 12; i++)
		{
			System.out.printf("%.2f \t\t %.2f\n",prices[i],priceIncrease[i]);
		}
		
	}
}