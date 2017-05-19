package sheet4Arrays;
public class Ex1TenElementArray
{
	public static void main(String [] args)
	{
		int [] numbers = new int[10];
		
		for(int i = 0; i < 10; i++)
		{
			numbers[i] = (i+1)*2;
		}
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print(numbers[i] +" ");
		}
	}
}