/** 
 * Author: Sandra Hawkins
 * Date:   24 May 2017
 * ExerciseSolutions/sheet4BArrays/Ex1SearchingSortingAnArray.java
 */ 
package sheet4BArrays;

import java.util.Arrays;
import java.util.Random;

public class Ex1SearchingSortingAnArray {

	public static void main(String[] args) {

		Ex1SearchingSortingAnArray ex1 = new Ex1SearchingSortingAnArray();

		int [] nums = new int [10];  // {2, 5, 6, 8, 12, 16, 2, ....}
		ex1.populateArrayWithRandomNumbers(nums);
		ex1.printMyArray(nums);
		ex1.findSmallestElement(nums);
		ex1.findLargestElement(nums);
		ex1.searchArray(nums, 5);
		System.out.println("Sorting......");
		ex1.sortArray(nums);
		ex1.printMyArray(nums);

		/* There is a class in the API called Arrays, which contains
		 * static methods for searching and sorting arrays. You will 
		 * rarely need to created your own methods like we have done
		 * below and instead you can call these static methods. Here
		 * are some examples below. 
		 * 
		 * NOTE: before the Arrays class can search in your array, it
		 * must first be sorted, you can call Arrays.sort(myArray) to
		 * do this for you. 
		 **/
		/* Sort first before calling any other methods */
				Arrays.sort(nums);
				ex1.printMyArray(nums); // print the sorted array
				/* Search in my array for the number 5.  */
				int foundAtPosition = Arrays.binarySearch(nums, 5);
				/* If a negative number is returned, then the number was 
				 * not found.If */		
				System.out.println(foundAtPosition < 0 ? 
						"Not found" : "5 found at " + foundAtPosition);
	}

	public void sortArray(int [] nums) {
		//      {8, 9, 3, 10, 4, 1, 7, 9, 2, 5, 4}
		// i     0    
		// j        1
		// smallest = 1			position = 0

		for (int i = 0; i < nums.length; i++) {
			int position = i;
			int smallest = nums[i];

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[j] < smallest) {
					smallest = nums[j];
					position = j;
				}
				int temp = nums[i];
				nums[i] = smallest;
				nums[position] = temp;
			}
		}
	}

	public void searchArray(int [] nums, int value) {
		/* Loop through the whole array */
		for (int i = 0; i < nums.length; i++) {
			/* When a match is found */
			if (nums[i] == value) {
				/* Using 'i' I can print the position that the value
				 * is found at, and exit the loop afterwards */
				System.out.printf("%d found at position %d\n", value, i + 1);
				/* Exits the loop after the first match is found  */
				break;
			}
		}
	}

	public void findLargestElement(int [] nums) {
		if (nums.length != 0) {
			int largest = nums[0];
			int positionFound = 0;
			/* This loop will always iterate the whole array when looking 
			 * for the largest. I cannot use 'i' for the position the 
			 * largest is found at because i will always be 20 when 
			 * the loop is finished. I need another variable called
			 * positionFound to hold the correct position. */
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] > largest) {
					largest = nums[i];
					positionFound = i + 1;
				}
			}
			System.out.printf("The largest element is %d at position %d\n",
					largest, positionFound);
		} else {
			System.out.println("The array is empty");
		}
	}

	public void findSmallestElement(int [] nums) {
		/* If the array is not empty, search for the smallest */
		if (nums.length != 0) {
			int smallest = nums[0];

			/* This loop starts at 1 to skip the first element */
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] < smallest)
					smallest = nums[i];
			}

			System.out.println("The smallest element is " + smallest);
		} else {
			System.out.println("The array is empty");
		}
	}

	public void populateArrayWithRandomNumbers(int [] nums) {
		/* Creates an instance of the Random class, so that I can 
		 * use it to generate random ints by calling .nextInt()
		 * on the instance. */
		Random random = new Random(); 

		for (int i = 0; i < nums.length; i++) {
			/* random.nextInt(20) will return a number between 0 and 19,
			 * when I add one, I get a number between 1 and 20 */
			nums[i] = random.nextInt(20) + 1;
		}
	}

	public void printMyArray(int [] nums) {
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}