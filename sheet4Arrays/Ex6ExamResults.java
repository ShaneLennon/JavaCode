package sheet4Arrays;
public class Ex6ExamResults
{
	public static void main(String [] args)
	{
		Ex6ExamResults m = new Ex6ExamResults();
		int [] results1 = {40,20,50};
		int [] results2 = {39,38,41};
		int [] results3 = {45,40,33};
		
		//boolean passOrFail = false;
		
		boolean passOrFail1 = m.calculateResult(results1);
		boolean passOrFail2 = m.calculateResult(results2);
		boolean passOrFail3 = m.calculateResult(results3);
		
		String result1;
		String result2;
		String result3;
		
		if(passOrFail1)
		{
			result1 = "Pass";
		}
		else
		{
			result1 = "Fail";
		}
		
		if(passOrFail2)
		{
			result2 = "Pass";
		}
		else
		{
			result2 = "Fail";
		}
		
		if(passOrFail3)
		{
			result3 = "Pass";
		}
		else
		{
			result3 = "Fail";
		}
		
		System.out.println("Results 1:\t"+results1[0]+"\t"+results1[1]+"\t"+results1[2]+"\t"+result1);
		System.out.println("Results 2:\t"+results2[0]+"\t"+results2[1]+"\t"+results2[2]+"\t"+result2);
		System.out.println("Results 3:\t"+results3[0]+"\t"+results3[1]+"\t"+results3[2]+"\t"+result3);
		
	}
	
	public boolean calculateResult(int [] examResults)
	{
		boolean passOrFail = false;
		double average = 0;
		double total = 0;
		
		for(int i = 0; i < examResults.length; i++)
		{
			total = total + examResults[i];
		}
		
		average = total/examResults.length;
		
		if(average >= 40)
		{
			passOrFail = true;
		}
		else
		{
			passOrFail = false;
		}
		return passOrFail;
	}
}