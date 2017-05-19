package sheet4BArrays;
import java.util.Random;

public class Ex1LargestSmallestSearchingSorting {

	public static void main(String[] args) 
	{
		Ex1LargestSmallestSearchingSorting ex1 = new Ex1LargestSmallestSearchingSorting();
		
		/*Creates an instance of a Random class */
		Random random = new Random();
		
		int [] numbers = new int[50];
		
		System.out.println("The length of the random array is: "+numbers.length);
		
		System.out.println("Random array");
		for(int i = 0; i < numbers.length; i++)
		{
			/*random.nextInt(100) will return a random number
			 * between 0 (inclusive) and 100 (exclusive).
			 * + 1 will mean the number is between 1 and 100. 
			 * */
			numbers[i] = random.nextInt(100)+1;
		}
		
		ex1.printArray(numbers);
		
		System.out.println();
		
		ex1.findSmallestElement(numbers);
		
		System.out.println();
		
		ex1.findLargestElement(numbers);
		
		ex1.searchArray(numbers,1);
		
		System.out.println();
		
		ex1.bubbleSort(numbers);
		
		System.out.println();
		
		ex1.sortArray(numbers);
	}
	
	public void findSmallestElement(int [] numbers)
	{	/*The variable smallest is assigned the first value in the numbers array*/
		int smallest = numbers[0];
		int index = 0;
		/*The numbers array is looped through*/
		for(int i = 0; i < numbers.length; i ++)
		{	/*The first value in the numbers is compared to the value in smallest
		 	If the value in numbers is smaller than smallest then this value is assigned to smallest*/
			if(numbers[i] < smallest)
			{
				/*assigns the value in the numbers array to the smallest variable*/
				smallest = numbers[i];
				/*index is used to keep track of the index of the smallest value in the array*/
				index = i;
			}
		}
		System.out.println("The smallest element is "+smallest+" and is at index "+index);
	}
	
	public void findLargestElement(int [] numbers)
	{	/*The variable largest is assigned the value of the first value in the random numbers array*/
		int largest = numbers[0];
		/*index holds the index of the largest number in the array*/
		int index = 0;
		/*The numbers array is looped through*/
		for(int i = 0; i < numbers.length; i ++)
		{	/*checks to see if the number in the array is bigger than the current value of largest*/
			if(numbers[i] > largest)
			{
				/*If it is bigger then this value is assigned to the largest variable*/
				largest = numbers[i];
				/*index keeps track of the index of the largest number in the array*/
				index = i;
			}
		}
		System.out.println("The largest element is "+largest+" and is at index "+index);
	}
	/*Prints an array of numbers*/
	public void printArray(int [] numbers)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i]+ " ");
		}
		System.out.println();
	}
	
	/*Searches an array of numbers for a specific value*/
	public void searchArray(int [] numbers, int num)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] == num)
			{
				System.out.println(num+" was found at position "+i);
			}
		}
	}
	
	/*Finds the smallest element in an array and returns the value*/
	public int findSmallestElement2(int [] numbers)
	{
		int smallest = numbers[0];
		
		for(int i = 0; i < numbers.length; i ++)
		{
			if(numbers[i] < smallest)
			{
				smallest = numbers[i];
			}
		}
		return smallest;
	}
	
	/*Sorts an array of random numbers into ascending order*/
	public void bubbleSort(int[] array) 
	{
	    boolean swapped = true;
	    int j = 0;
	    int tmp;
	    while (swapped) 
	    {
	    	swapped = false;
	        j++;
	        for (int i = 0; i < array.length - j; i++) 
	        {
	            if (array[i] > array[i + 1]) 
	            {
	                tmp = array[i];
	                array[i] = array[i + 1];
	                array[i + 1] = tmp;
	                swapped = true;
	            }
	        }
	    }
	    System.out.println("BubbleSort");
	    for(int k = 0; k < array.length; k++)
	    {
	    	System.out.print(array[k]+" ");
	    }
	}
	
	
	public void sortArray(int [] numbers)
	{
		int size = numbers.length;
		int [] numbers3 = new int[size];
		int smallest = 0;
		
		for(int j = 0; j < size; j++)
		{
			smallest = findSmallestElement2(numbers);
			numbers3[j] = smallest;
			
			//System.out.println("Numbers 3");
			//printArray(numbers3);
			for(int i = 0; i < size; i++)
			{
				if(numbers[i] == smallest)
				{
					numbers[i] = 200;
				}
			}
		}
		System.out.println("Numbers 3");
		//printArray(numbers3);
		
		int count = 0;
		for(int i = 0; i < numbers3.length; i++)
		{
			if(numbers3[i] != 200)
			{
				count++;
			}
		}
		System.out.println("count is "+count);
		
		int [] numbers2 = new int[count];
		
		//printArray(numbers2);
		
		for(int k = 0; k < count; k++)
		{
			numbers2[k] = numbers3[k];
		}
		
		printArray(numbers2);
	}
	
}
	
