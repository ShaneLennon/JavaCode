package Ex7EmployeeAndClock;

public class Employee 
{
	/*Member variables*/
	private String name;
	private int age;
	private double salary;
	private int employeeNumber;
	private int numSickDays;
	public static int numberOfEmployees; 
	
	//Constructors
	public Employee()
	{
		numberOfEmployees++;
	}
	
	public Employee(String name)
	{
		this();
		setName(name);
	}
	
	public Employee(String name, int age, double salary, int employeeNumber, int numSickDays)
	{
		this();
		setName(name);
		setAge(age);
		setSalary(salary);
		setEmpNumber(employeeNumber);
		setNumSickDays(numSickDays);
		
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getEmpNUmber()
	{
		return employeeNumber;
	}
	
	public int numSickDays()
	{
		return numSickDays;
	}
	
	//setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public void setEmpNumber(int employeeNumber)
	{
		this.employeeNumber = employeeNumber;
	}
	
	public void setNumSickDays(int numSickDays)
	{
		this.numSickDays = numSickDays;
	}
	
	public void increaseSalary(double increase)
	{
		salary = salary+increase;
	}
	
	public String toString()
	{
		return String.format("Name %s\nAge %d\nSalary %,.2f\nEmployee number %d\nNumber of sick days %d\n",name,age,salary,employeeNumber,numSickDays);
	}
}
