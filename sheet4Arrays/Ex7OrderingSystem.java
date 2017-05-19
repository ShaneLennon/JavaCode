package sheet4Arrays;
import javax.swing.JOptionPane;
import java.util.concurrent.SynchronousQueue;

public class Ex7OrderingSystem {

	public static void main(String[] args) 
	{
		int [] refNums = {1000, 1001, 1002, 1003, 1004};
		String [] productNames = {"Keyboard" ,"Mouse", "Monitor", "Mouse mat", "Speakers"};
		double [] prices = {49.99, 15.51, 124.99, 3.99, 23.52};
		
		System.out.println("Reference Number\tProduct Name\tPrice");
		System.out.println("--------------------------------------------------");
		/*
		 * %-23d means left align an integer with column with 23
		 * %-15s means left align a String with column width 15
		 * %.2f means left align a double and round to 2 decimal places
		 */
		for(int i = 0; i < refNums.length; i++)
		{
			System.out.printf("%-23d %-15s € %.2f \n",refNums[i],productNames[i],prices[i]);
		}
		
		//Takes in a String from the Input dialog and assigns it to the input variable
		String input = JOptionPane.showInputDialog("Please enter a reference number");
		//Converts the input String to an integer and assigns it to an integer variable
		int refNum = Integer.parseInt(input);
		
		/*
		 * loops through the refNums array and compares each element to the refNum variable
		 */
		for(int i = 0; i < refNums.length; i++)
		{
			/*Loop through the reference number array and see which number matches what the user typed in
			 * When it finds a match the corresponding product and price is found and added to the String s*/
			if(refNum == refNums[i])
			{
				String s = "Thats is a "+productNames[i]+" and it costs €"+prices[i];
				
				//This prints out a message to the user
				JOptionPane.showMessageDialog(null,s, 
						"Message", JOptionPane.INFORMATION_MESSAGE);
				
				//This asks the user for input and the input is converted to an int
				input = JOptionPane.showInputDialog("How many would you like to order?");
				
				int quantity = Integer.parseInt(input);
				//the totlal cost is calculated and added to a String s
				double totalCost = quantity*prices[i];
				
				s = "The total cost of your order will be €"+totalCost;
				//The String is printed ot on the Message Dialog
				JOptionPane.showMessageDialog(null,s, 
						"Message", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}
