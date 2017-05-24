package sheet4_2DArrays;

public class Ex3Calendar {

	public static void main(String[] args) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November","December" };

		String[] days = { "M", "T", "W", "T", "F", "S", "S" };
		
		int[][] daysInEachMonth = 
				{{1,2,3,4, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,28},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}};
		
		int startingDay = 6;
		int printCounter = startingDay;
		/*Loops through the months array*/
		for(int m = 0; m < months.length; m++)
		{	
			/*Prints out the name of the month*/
			System.out.println(months[m]);
			/*Prints out the heading for each month
			 * %-3 prints a String with column width 3 and left aligned*/
			for (int i = 0; i < days.length; i++) 
			{
				System.out.printf("%-3s",days[i]);
			}
			System.out.println();
			
			/*If the printCounter is greater than 0 print out empty spaces*/
			if(printCounter > 0)
			{
				for(int k = 0; k < printCounter; k++)
				{	/*Prints out empty spaces*/
					System.out.printf("%-3s"," ");
				}
			}
			/*Prints out the days of the month starting with January*/
			for(int j = 0; j < daysInEachMonth[m].length; j++)
			{	/*Prints out the days in each month in rows
			 	Starts with January and prints out each date in the month
			 	left aligned and column width 3*/
				System.out.printf("%-3d",daysInEachMonth[m][j]);
				
				/*If printCounter + 1 % 7 = 0 then move to the next line
				 * else keep printing on the same line and increment printCounter by 1
				 when printCounter reaches 6 again a new line gets called and printCounter is reset to 0 for the next line*/
				if((printCounter+1) % 7 == 0)
				{
					System.out.println();
					printCounter= 0 ;
				}
				/*Otherwise stay on the same line and increment printCounter variable by 1. It will reset to 0 when it reaches 6 again*/
				else
				{
					printCounter++;
				}
			}
			System.out.println();
			System.out.println();
		}
	}
}
