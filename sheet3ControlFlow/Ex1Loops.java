package sheet3ControlFlow;
public class Ex1Loops
{
	public static void main(String [] args)
	{
		int i = 0;
		while(i < 23)
		{
			if(i != 22)
			{
				System.out.print(i+",");
			}
			else
			{
				System.out.print(i);
			}
			i++;
		}
		
		System.out.println();
		
		int j = 0;
		do
		{
			if(j != 22)
			{
				System.out.print(j+",");
			}
			else
			{
				System.out.print(j);
			}
			j++;
		}
		while(j < 23);
		
		System.out.println();
		
		for(int k = 0; k < 23; k++)
		{
			if(k != 22)
			{
				System.out.print(k+",");
			}
			else
			{
				System.out.print(k);
			}
		}
	}
}