package sheet4BArrays;

import java.util.concurrent.SynchronousQueue;

public class ArraysPractice {
	

	public static void main(String[] args)
	{
		int [][] matrix = new int [20][5];
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[i].length; j++)
			{
				matrix[i][j] = 0;
			}
		}
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int [][] exams = {{39,50},{90},{39,90,40},{20}};
		
		for(int i = 0; i < exams.length; i++)
		{
			for(int j = 0; j < exams[i].length; j++)
			{
				System.out.print(exams[i][j]+" ");
			}
			System.out.println();
		}
	}

}
