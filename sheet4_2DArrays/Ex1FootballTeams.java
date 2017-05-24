package sheet4_2DArrays;
import java.util.Scanner;

public class Ex1FootballTeams {

	public static void main(String[] args) 
	{
		Ex1FootballTeams ex1 = new Ex1FootballTeams();
		
		Scanner input = new Scanner(System.in);
		//A String array of 5 rows and 12 columns
		String [][] footBallTeams  = new String [5][12];
		
		System.out.println("Number of rows "+footBallTeams.length);
		System.out.println("Number of columns "+footBallTeams[0].length);
		System.out.println();
		
		//prints out the String array of football teams
		ex1.printArray(footBallTeams);
		
		for(int i = 0; i < footBallTeams.length; i++)
		{
			/*number of columns is 12
			 *want to stay in first column
			 */ 
			System.out.print("Enter a football team name : ");
			String name = input.nextLine();
			// i is the row number and 0 is column number
			// loops column 0 rows 0 to 4 and adds the football teams to the first column to the array
			footBallTeams[i][0] = name;
		}
		//prints a blank line
		System.out.println();
		
		//prints out the String array of footballteams
		ex1.printArray(footBallTeams);
		
			// Adds the player names to each row
			// i is the row number
			for(int i = 0; i < footBallTeams.length; i++)
			{
				//j is the column number
				for(int j = 1; j < footBallTeams[i].length; j++)
				{
					System.out.print("Enter a players name : ");
					String name = input.nextLine();
					footBallTeams[i][j] = name;
				}
				System.out.println();
				//prints out the array with the added football team players
				
				ex1.printArray(footBallTeams);
			}
	}
	
	//A method to print out a 2d string array
	public void printArray(String [][] footballTeams)
	{
		//Prints out the empty array of Strings
		//k = 0, 1, 2, 3, 4  are the row numbers
		for(int k = 0; k < footballTeams.length; k++)
		{
			//j 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 are the column numbers
			for(int l = 0; l < footballTeams[k].length; l++)
			{
				System.out.print(footballTeams[k][l]+" ");
			}
			System.out.println();
		}
		//prints a blank line
		System.out.println();
	}
	
}
	
	


