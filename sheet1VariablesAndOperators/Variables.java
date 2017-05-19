package sheet1VariablesAndOperators;
public class Variables
{
		public static void main(String [] args)
		{
			/* The range of a byte is -128 to 127 */
			byte verySmallNumber = -128;
			System.out.println("byte value: "+verySmallNumber);
			/* The range of a short is - 32,768 to 32,767 */
			
			short myAge = 34;
			System.out.println("I am : "+ myAge);
			myAge = (short)(myAge - 10);

			
			System.out.println("I am : "+ myAge);
			//Declares an int variable called number
			int number = 5;
			//an int stores a whole number
			System.out.println("Number is : " +number);
			
			long veryLargeNumber = 1234567891L;
			
			float price = 12.99f;
			double anotherPrice = 49.99;
			
			char myInitial = 'S';
			boolean isSummer = false;
			System.out.println("The season is Summer "+isSummer);
			boolean isSpring = true;
			System.out.println("The season is Spring "+isSpring);
			
			int doubleMyAge = myAge * 2;
			int firstNumber = 15;
			int half = firstNumber / 2;
			System.out.println("Half of 15 is "+half);
			
			String message = "The end";
			
		}
	}