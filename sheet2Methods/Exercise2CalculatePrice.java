package sheet2Methods;
public class Exercise2CalculatePrice
{
	public static void main(String [] args)
	{
		Exercise2CalculatePrice m = new Exercise2CalculatePrice();
		
		double price = 2.99;
		int quantity = 5;
		
		m.calculatePrice(price,quantity);
	}
	/*
	A private method can only be called in the class as the method.
	i.e. this method is being called from main() above which is in the same class
	*/
	private void calculatePrice(double price, int quantity)
	{
		double total;
		total = price*quantity;
		System.out.printf("The total price is %.2f ",total);
	}
}