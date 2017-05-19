package sheet2Methods;
public class Ex9TempConversion
{
	public static void main(String [] args)
	{
		Ex9TempConversion m = new Ex9TempConversion();
		double fahrenheit = 89;
		double celsius1 = 32;
		double celsius = m.fahrenheitToCelsius(fahrenheit);
		double fahrenheit1 = m.celsiusToFahrenheit(celsius1);
		
		System.out.printf("%.2f degrees fahrenheit equals %.2f degrees celsius",fahrenheit,celsius);
		System.out.println();
		System.out.printf("%.2f degrees celsius equals %.2f degrees fahrenheit",celsius1,fahrenheit1);
	}
	
	public double fahrenheitToCelsius(double fahrenheit)
	{
		double celsius = (5f/9f)*(fahrenheit - 32);
		return celsius;
	}
	
	public double celsiusToFahrenheit(double celsius)
	{
		double fahrenheit = ((9f/5f)*celsius)+32;
		return fahrenheit;
	}
}