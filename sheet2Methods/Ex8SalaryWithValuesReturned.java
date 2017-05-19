package sheet2Methods;
public class Ex8SalaryWithValuesReturned
{
	public static void main(String [] args)
	{
		int yearlySalary = 67500;
		Ex8SalaryWithValuesReturned m = new Ex8SalaryWithValuesReturned();
		
		double monthlySalary = m.getMonthlySalary(yearlySalary);
		double weeklySalary = m.getWeeklySalary(yearlySalary);
		double salaryAfterPayRise = m.salaryAfterPayRise(yearlySalary,7);
		
		System.out.printf("Monthly salary is %.2f ",monthlySalary);
		System.out.println();
		System.out.printf("Weekly salary is %.2f ",weeklySalary);
		System.out.println();
		System.out.printf("Salary before payrise %d and after payrise %.2f ",yearlySalary, salaryAfterPayRise);
	}
	
	public double getMonthlySalary(int yearlySalary)
	{
		double monthlySalary = (double)yearlySalary/12;
		return monthlySalary; 
	}
	
	public double getWeeklySalary(int yearlySalary)
	{
		double weeklySalary = (double)yearlySalary/52;
		return weeklySalary;
	}
	
	public double salaryAfterPayRise(int salary, double percentIncrease)
	{
		double newSalary = salary + salary*(percentIncrease/100);
		return newSalary;
	}
}