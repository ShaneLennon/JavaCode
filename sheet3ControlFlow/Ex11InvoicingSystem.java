package sheet3ControlFlow;
public class Ex11InvoicingSystem
{
	public static void main(String [] args)
	{
		Ex11InvoicingSystem m = new Ex11InvoicingSystem();
		int numUnits = 100;
		double unitPrice = 2;
		int refNum = 12245;
		
		m.totalCost(unitPrice,numUnits,refNum);
	}
	public void totalCost(double unitPrice, int numUnits, int refNum)
	{
		int remainder = 0;
		double totalCost = 0;
		/*If the quantity is over 100, the first 100 products 
		 * are charged at the base price and any additional 
		 * products are charged at 75% of the price
		 */
		if(numUnits > 100)
		{
			remainder = numUnits - 100;
			totalCost = 100*unitPrice + remainder*unitPrice*0.75;
			
		}
		/*If the quantity is less than or equal to 100 
		 * products are charged at base price
		 */
		else
		{
			totalCost = numUnits*unitPrice;
			
		}
		System.out.printf("The total cost of product %d is €%.2f ",refNum,totalCost);
	}
	
}