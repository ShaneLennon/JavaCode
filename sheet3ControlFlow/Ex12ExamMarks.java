package sheet3ControlFlow;
public class Ex12ExamMarks
{
	public static void main(String [] args)
	{
		int mark1 = 30;
		int mark2 = 70;
		int mark3 = 50;
		
		Ex12ExamMarks ex12 = new Ex12ExamMarks();
		ex12.passOrFail(mark1, mark2, mark3);
	}
	public void passOrFail(int mark1, int mark2,int mark3)
	{
		double average = (double)(mark1+mark2+mark3)/3;
		System.out.printf("Average was  %.2f\n",average);
		
		/*If all 3 marks are greater than or equal to 40 then the student passed 
		 */
		if(mark1 >= 40 && mark2 >= 40 && mark3 >= 40)
		{
			System.out.println("The student passed!!");
		}
		/*If they failed one but average was greater than or equal to 50 then they passed
		 * 
		 */
		else if(mark1 < 40|| mark2 < 40 || mark3 < 40 && average >=  50)
		{
			System.out.println("The student passed!");
		}
		else
		{
			System.out.println("The student failed");
		}
	}
	
}