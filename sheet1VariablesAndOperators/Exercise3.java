package sheet1VariablesAndOperators;
public class Exercise3
{
	public static void main(String [] args)
	{
		double salary = 65000;
		
		double yourMonthlySalary = salary/12;
		double yourWeeklySalary = salary/52;
		double totalEarnedIn5Years = salary*5;
		double newSalaryWith8PercentPayRise = salary = salary + salary*0.08;
		
		System.out.printf("Your monthly salary is %.2f\n",yourMonthlySalary);
		System.out.printf("Your weekly salary is %.2f\n",yourWeeklySalary);
		System.out.println("The total you will earn in 5 years is "+totalEarnedIn5Years);
		System.out.println("Your new salary if you get an 8% pay rise is "+newSalaryWith8PercentPayRise);
	}
}