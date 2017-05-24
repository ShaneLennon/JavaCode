package sheet4_2DArrays;

import java.util.concurrent.SynchronousQueue;

public class Ex4TotalSales2 {
	public static void main(String[] args)
	{
		Ex4TotalSales2 ex4 = new Ex4TotalSales2();

		int[][] sales = { { 1, 1, 100 }, { 1, 2, 200 }, { 1, 3, 400 }, { 1, 1, 300 }, { 2, 4, 400 }, { 2, 5, 500 },
				{ 2, 3, 600 }, { 2, 3, 600 }, { 3, 2, 1000 }, { 3, 3, 800 }, { 3, 4, 300 }, { 3, 4, 500 },
				{ 4, 1, 200 }, { 4, 3, 300 }, { 4, 5, 500 } };
		
		ex4.printArray(sales);
		
		
		/*Setup the matrix to hold a sum of all the sales for each person for each product*/
		int [][] totals2 = new int[5][4];
		
		int [][] table = ex4.calculateTotal(totals2, sales);
		
		ex4.printTable(table);
		
	}

	public void printArray(int[][] sales) 
	{
		for (int i = 0; i < sales.length; i++) 
		{
			// j 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 are the column numbers
			for (int j = 0; j < sales[i].length; j++) 
			{
				System.out.printf("%-10d",sales[i][j]);
			}
			System.out.println();
		}
		// prints a blank line
		System.out.println();
	}
	
	//                       
	public int [][] calculateTotal(int [][] totals2, int[][] sales) 
	{

		/*Loop to populate the matrix*/
		for(int k = 0; k < 4; k++)
		{
			for (int i = 0; i < sales.length; i++) 
			{	
					for(int j = 0 ; j < 5 ; j++)
					{
						if (sales[i][0] == k+1 && sales[i][1] == j+1) 
						{
							totals2[j][k] = totals2[j][k] + sales[i][2];
						}
					}
			}
		}
			/*for (int i = 0; i < sales.length; i++) 
			{	
					for(int j = 0 ; j < 5 ; j++)
					{
						if (sales[i][0] == 1 && sales[i][1] == j+1) 
						{
							totals2[j][0] = totals2[j][0] + sales[i][2];
						}
					}
			}
			for (int i = 0; i < sales.length; i++) 
			{	
					for(int j = 0 ; j < 5 ; j++)
					{
						if (sales[i][0] == 2 && sales[i][1] == j+1) 
						{
							totals2[j][1] = totals2[j][1] + sales[i][2];
						}
					}
			}
			
			for (int i = 0; i < sales.length; i++) 
			{	
					for(int j = 0 ; j < 5 ; j++)
					{
						if (sales[i][0] == 3 && sales[i][1] == j+1) 
						{
							totals2[j][2] = totals2[j][2] + sales[i][2];
						}
					}
			}
			
			for (int i = 0; i < sales.length; i++) 
			{	
					for(int j = 0 ; j < 5 ; j++)
					{
						if (sales[i][0] == 4 && sales[i][1] == j+1) 
						{
							totals2[j][3] = totals2[j][3] + sales[i][2];
						}
					}
			}*/
		
		return totals2;
	}
	
	public void printTable(int [][] table)
	{
		int [] crossTotalRow = new int[5];
		for(int i = 0; i < table.length; i++)
		{
			for(int j = 0; j < table[i].length; j++)
			{
				crossTotalRow[i] = crossTotalRow[i] + table[i][j];
			}
		}
		
		int [] crossTotalColumn = new int[4];
		
		for(int i = 0; i < table[i].length; i++)
		{
			for(int j = 0; j < table.length; j++)
			{
				crossTotalColumn[i] = crossTotalColumn[i] + table[j][i];
			}
		}
		
		int total = 0;
		
		for(int i = 0; i < crossTotalColumn.length; i++)
		{
			total = total + crossTotalColumn[i];
		}
		
		System.out.printf("%-10s %-9d %-9d %-9d %-9d %s\n"," ",1,2,3,4,"Total");
		System.out.println("--------------------------------------------------------");
		
		
		for (int i = 0; i < table.length; i++) 
		{
			System.out.printf("%d",i+1);
			System.out.printf("%s %8s","|"," ");
			for (int j = 0; j < table[i].length; j++) 
			{
				System.out.printf("%-10d",table[i][j]);
			}
			System.out.printf("%d",crossTotalRow[i]);
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------------");
		System.out.printf("%-11s","Totals");
		
		for(int i = 0; i < crossTotalColumn.length; i++)
		{	
			System.out.printf("%-10d",crossTotalColumn[i]);
		}
		
		System.out.print(total);
		
		// prints a blank line
		System.out.println();
	}
	
}

