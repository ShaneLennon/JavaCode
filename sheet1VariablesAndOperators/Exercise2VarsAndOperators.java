package sheet1VariablesAndOperators;
public class Exercise2VarsAndOperators
{
	public static void main(String [] args)
	{
		int num1 = 25;
		float num2 = 3.6f;
		double num3 = 12.99d;
		int num4 = 42;
		
		System.out.println("Number 1 is "+num1);
		System.out.println("Number 2 is "+num2);
		System.out.println("Number 3 is "+num3);
		System.out.println("Number 4 is "+num4);
		
		double sum = num1 + num2 + num3 + num4;
		double product = num1*num2*num3*num4;
		
		System.out.printf("The sum of the numbers "+num1+", "+num2+", "+num3+" and "+num4+" is %.2f\n",sum);
		System.out.printf("The product of the numbers "+num1+", "+num2+", "+num3+" and "+num4+" is %.2f",product);
	
	}
}