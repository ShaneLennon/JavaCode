package sheet4Arrays;
import javax.swing.JOptionPane;
public class Ex2DoubleArray
{
	public static void main(String [] args)
	{
		double total = 0;
		double [] numbers = new double[10];
		
		for(int i = 0; i < 10; i++)
		{
			String input = JOptionPane.showInputDialog("Please double: "+(i+1));
		
			numbers[i]= Double.parseDouble(input);
			total = total+numbers[i];
		}
		double average = total/10;
		System.out.println("The total of the 10 numbers is "+total);
		System.out.println("The average of the 10 numbers is "+average);
	}
}