package sheet3ControlFlow;
public class StringTest
{
	public static void main(String [] args)
	{
		int empCount = 50;
		String line1 = "Oh what a beautiful morning!";
		System.out.println(line1);
		String line2 = line1 + "\nOh what a beautiful day!";
		System.out.println(line2);
		line2 = line2 + empCount;
		System.out.println(line2);
		String s = "50";
		int i = Integer.parseInt(s);
		i = i + 3;
		System.out.println(i);
		char a = s.charAt(0);
		System.out.println(a);
		int j = s.length();
		System.out.println(j);
	}
}