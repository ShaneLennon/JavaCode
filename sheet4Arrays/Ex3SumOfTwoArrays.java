package sheet4Arrays;
public class Ex3SumOfTwoArrays
{
	public static void main(String [] args)
	{
	
		Ex3SumOfTwoArrays m = new Ex3SumOfTwoArrays();
		int [] numbers1 = {1,2,3,4,5,6,7,8};
		int [] numbers2 = {8,9,1,8,1,6,8,4};
		
		m.addTwoArrays(numbers1,numbers2);
	}
	public void addTwoArrays(int [] numbers1, int [] numbers2)
	{
		int [] total = new int[8];
		for(int i = 0; i < 8; i++)
		{
			total[i] = numbers1[i] + numbers2[i]; 
		}
		
		System.out.println("Array 1 Array 2 Sum");
		for(int i = 0; i < 8; i++)
		{
			System.out.println(numbers1[i]+"\t"+numbers2[i]+"\t"+total[i]);
		}
		
		System.out.println();
		System.out.printf("%-12s %-12s %s\n","Array1","Array2","Sum");
		
		for(int i = 0; i < 8; i++)
		{
			System.out.printf("%-12d %-12d %d\n",numbers1[i],numbers2[i],total[i]);
		}
	}
}