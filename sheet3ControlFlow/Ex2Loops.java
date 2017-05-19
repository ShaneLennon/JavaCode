package sheet3ControlFlow;
public class Ex2Loops
{
	public static void main(String [] args)
	{
		int i = 100;
		while(i <= 200)
		{
			System.out.print(i + " ");
			i = i+2;;
		}
		
		System.out.println();
		
		for(int j = 100; j <=200; j=j+2)
		{
			System.out.print(j + " ");
		}
	}
}