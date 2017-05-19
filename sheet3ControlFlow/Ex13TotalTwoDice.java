package sheet3ControlFlow;
public class Ex13TotalTwoDice
{
	public static void main(String [] args)
	{
		Ex13TotalTwoDice m = new Ex13TotalTwoDice();
		m.totalTwoDice();
	}
	
	public void totalTwoDice()
	{
		int total = 0;
		int dice1 = (int)(Math.random()*6) + 1;
		int dice2 = (int)(Math.random()*6) +1;
		System.out.println("Dice 1 is: "+dice1);
		System.out.println("Dice 2 is: "+dice2);
		total = dice1+dice2;
		System.out.println("The total of the 2 dice is: "+total);
	}
}