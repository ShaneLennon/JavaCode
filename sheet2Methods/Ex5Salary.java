package sheet2Methods;

public class Ex5Salary
{
	public static void main(String [] args)
	{
		/*This line creates an instance of the class Ex5Salary
		*/
		Ex5Salary m = new Ex5Salary();
		int yearlySalary = 66400;
		
		m.printMonthlySalary(yearlySalary);
		System.out.println();
		m.printWeeklySalary(yearlySalary);
		System.out.println();
		m.salaryAfterPayRise(yearlySalary,6);
	}

	public void printMonthlySalary(int yearlySalary)
	{
		double monthlySalary = (double)yearlySalary/12;
		System.out.printf("Monthly Salary is %.2f",monthlySalary);
	}
	
	public void printWeeklySalary(int yearlySalary)
	{
		double weeklySalary = (double)yearlySalary/52;
		System.out.printf("Weekly Salary is %.2f",weeklySalary);
	}
	/*
	salary is the yearly salary
	payrise is the percentage payrise, e.g. 4%
										30000              4*/
	public void salaryAfterPayRise(int salary, double percentIncrease)
	{
		double newSalary = salary + salary*(percentIncrease/100);
		System.out.printf("The salary was %d. The salary after pay rise is %.2f",salary,newSalary);
	}
}