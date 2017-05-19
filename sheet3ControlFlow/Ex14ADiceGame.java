package sheet3ControlFlow;
public class Ex14ADiceGame
{
	public static void main(String [] args)
	{
		int total = 0;
		
		Ex14ADiceGame m = new Ex14ADiceGame();
		m.totalTwoDice();
	}
	
	public void totalTwoDice()
	{
		int total = 0;
		int die1 = 4;//(int)(Math.random()*6) +1;
		int die2 = 3;//(int)(Math.random()*6) +1;
		System.out.println("Dice 1 is: "+die1);
		System.out.println("Dice 2 is: "+die2);
		
		if(die1 == 6 || die2 == 6)
		{
			total = die1 + die2;
		}
		else if(die1 == 3 && die2 == 3)
		{
			total = (die1*die2) + 20;
		}
		else if(die1 == 3 || die2 == 3)
		{
			total = (die1*die2) + 10;
		}
		else if(die1 == 5 || die2 == 5)
		{
			total = (die1*die2) - 4;
		}
		else if(die1 == 5 && die2 == 5)
		{
			total =(die1*die2) -8;
		}
		else
		{
			total = die1*die2;
		}
		
		
		System.out.println("The product of the 2 dice is: "+total);
	}
}