package sheet4Arrays;

public class ArgsInMain
{
	public static void main(String [] args)
	{
		System.out.println("Size of args: "+args.length);
		System.out.println("args[0] "+ args[0]);
		
		for(int i = 0; i < args.length; i++)
		{
			System.out.printf("args %d is: %s \n",i ,args[i]);
		}
	}
}