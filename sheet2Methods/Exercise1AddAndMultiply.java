package sheet2Methods;
public class Exercise1AddAndMultiply
{
	public static void main(String [] args)
	{
		Exercise1AddAndMultiply m = new Exercise1AddAndMultiply();
		
		int num1 = 10;
		int num2 = 14;
	
		m.addTwoNumbers(num1,num2);
		m.subtractTwoNumbers(num1,num2);
		m.multiplyTwoNumbers(num1,num2);
		m.modulusTwoNumbers(num1,num2);
	}
	
	public void addTwoNumbers(int a, int b)
	{
		int result; 
		result = a + b;
		System.out.printf("Adding %d and %d gives %d\n",a,b,result);
	}
	
	public void subtractTwoNumbers(int a, int b)
	{
		int result;
		result = a - b;
		System.out.printf("Subtracting %d from %d equals %d\n ",a,b,result);
	}
	
	public void multiplyTwoNumbers(int a, int b)
	{
		int result;
		result = a*b;
		System.out.printf("Multiplying %d by %d equals %d\n ",a,b,result);
	}
	
	public void modulusTwoNumbers(int a, int b)
	{
		int result;
		result = b%a;
		System.out.printf("%d mod %d equals ",b,a,result);
	}
}