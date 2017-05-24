package Ex7EmployeeAndClock;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Shane Lennon",34,35000,100,2);
		
		System.out.println(e1);
		
		Employee e2 = new Employee("Colin Lennon",32,30000,102,5);
		
		System.out.println(e2);
		
		System.out.println("Number of employees created: "+Employee.numberOfEmployees);
		
		e2.increaseSalary(5000);
		
		System.out.println(e2);
		
		Employee e3 = new Employee("Getasew Wubetu",40,25000,110,4);
		
		System.out.println(e3);
		
		System.out.println("Number of employees created: "+Employee.numberOfEmployees);
		
		Employee e4 = new Employee("Joe Lennon");
		e4.setAge(62);
		e4.setSalary(15000);
		e4.setEmpNumber(130);
		e4.setNumSickDays(4);
		
		System.out.println(e4);
		
		System.out.println("Number of employees created: "+Employee.numberOfEmployees);
	}

}
