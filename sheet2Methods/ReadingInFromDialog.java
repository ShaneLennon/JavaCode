package sheet2Methods;
import javax.swing.JOptionPane;
public class ReadingInFromDialog {
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(
								"Please type a number");
		/*
		 * Convert the string into a number. Double.parseDouble() 
		 * takes a String and returns a double primitive.
		 * Integer.parseInt() will take a String and convert it
		 * to an int.
		 */
		double num = Double.parseDouble(input);
		
		String input2 = JOptionPane.showInputDialog("Please type a second number");
		double num2 = Double.parseDouble(input2);
		
		//int intNum = Integer.parseInt(JOptionPane.showInputDialog(
		//		                      "Please enter an int"));
		

		JOptionPane.showMessageDialog(null, "You typed " + input);
	}
}