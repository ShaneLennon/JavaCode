package sheet3ControlFlow;
public class Ex15SwitchTest
{
	public static void main(String [] args)
	{
		String a = "Joe";
		switch(a)
		{
			case "Shane":
			case "Colin":
				System.out.println("name is Shane or Colin");
				break;
			case "Paula":
			case "Joe":
				System.out.println("name is Paula or Joe");
				break;
			case "Danny":
			case "Justin":
				System.out.println("name is Danny or Justin");
				break;
			default: 
				System.out.println("num is something else");
				break;
		}
	}
}