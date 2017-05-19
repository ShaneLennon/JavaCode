package sheet1VariablesAndOperators;

public class Exercise2
{
	public static void main(String [] args)
	{
		int num1 = 25;
		double num2 = 3.6;
		double num3 = 12.99;
		int num4 = 42;
		
		System.out.println("Number 1 is "+num1);
		System.out.println("Number 2 is "+num2);
		System.out.println("Number 3 is "+num3);
		System.out.println("Number 4 is "+num4);
		
		double sum = num1 + num2 + num3 + num4;
		double product = num1*num2*num3*num4;
		
		System.out.println("The sum of the numbers "+num1+", "+num2+", "+num3+" and "+num4+" is "+sum);
		System.out.println("The product of the numbers "+num1+", "+num2+", "+num3+" and "+num4+" is " +product);
	
	}
}