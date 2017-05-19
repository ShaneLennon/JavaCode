package Ex5PracticeCreatingClasses;

public class PersonalComputer 
{
	//Member variables
	//These are created with every new object declared
	private int RAM;
	private int hardDrive;
	private String operatingSystem;
	private int monitorSize;
	private double cost;
	
	//Constants for RAM
	//finals cannot be changed
	public static final int RAM_4_GB = 4;
	public static final int RAM_8_GB = 8;
	public static final int RAM_16_GB = 16;
	
	//Constants for Hard Drive
	public static final int HD_100_GB = 100;
	public static final int HD_200_GB = 200;
	public static final int HD_300_GB = 300;
	
	//Constants for monitor size
	public static final int MonitorSize_17 = 17;
	public static final int MonitorSize_19 = 19;
	public static final int MonitorSize_21 = 21;
	
	//constants for Operating System
	public static final String Windows = "Windows";
	public static final String Apple = "Apple";
	public static final String Unix = "Unix";

	//This is the default constructor
	//It gives RAM, hard drive, operating system and monitor default values
	public PersonalComputer()
	{
		this.RAM = RAM_4_GB;
		this.hardDrive = HD_100_GB;
		this.operatingSystem = Windows;
		this.monitorSize = MonitorSize_17;
	}
	//This constructor sets up the RAM, hard drive and monitor sizes and the operating system 
	//The user passes values to the constructor using the parameter list
	public PersonalComputer(int RAM,int hardDrive,String operatingSystem,int monitorSize)
	{
		//the set methods perform validation
		setRAM(RAM);
		setHardDrive(hardDrive);
		setMonitorSize(monitorSize);
		setOperatingSystem(operatingSystem);
	}
	
	/*Getters and setters*/
	//Performs validation
	public void setRAM(int RAM)
	{	//If the RAM is not one of the values 4, 8 or 16 RAM will keep its default value
		//"Invalid RAM" is printed out
		if(RAM == RAM_4_GB || RAM == RAM_8_GB || RAM == RAM_16_GB)
		{
			this.RAM = RAM;
		}
		else
		{
			System.out.println("Invalid RAM");
		}
	}
	//Performs validation
	public void setHardDrive(int hardDrive)
	{	//The value of hard drive must be 100, 200 or 300
		if(hardDrive == HD_100_GB || hardDrive == HD_200_GB || hardDrive == HD_300_GB)
		{
			this.hardDrive = hardDrive;
		}
		else
		{
			System.out.println("Invalid Hard Drive");
		}
	}
	//Performs validation
	public void setMonitorSize(int monitorSize)
	{	//Monitor size must be 17, 19 or 21
		//Otherwise the monitor size is invalid
		if(monitorSize == MonitorSize_17|| monitorSize == MonitorSize_19 || monitorSize == MonitorSize_21)
		{
			this.monitorSize = monitorSize;
		}
		else
		{
			System.out.println("Invalid monitor size");
		}
	}
	
	public void setOperatingSystem(String operatingSystem)
	{	//Operating system must be "Windows", "Apple" or "Unix"
		if(operatingSystem.equals(Windows) || operatingSystem.equals(Apple) || operatingSystem.equals(Unix))
		{
			this.operatingSystem = operatingSystem;
		}
		else
		{
			System.out.println("Invalid operating System");
		}
	}
	//get methods
	public int getRAM()
	{
		return RAM;
	}
	
	public int getHardDrive()
	{
		return hardDrive;
	}
	
	public String getOperatingSystem()
	{
		return operatingSystem;
	}
	
	public int getMonitorSize()
	{
		return monitorSize;
	}
	//returns RAM as a String
	public String getRAMAsString()
	{
		switch(RAM){
		case RAM_4_GB:
			return "4 GB";
		case RAM_8_GB:
			return "8 GB";
		case RAM_16_GB:
			return "16 GB";
		default:
			return "RAM not set";
		}
	}
	//returns hard drive as a String
	public String getHardDriveAsString()
	{
		switch(hardDrive){
		case HD_100_GB:
			return "100 GB";
		case HD_200_GB:
			return "200 GB";
		case HD_300_GB:
			return "300 GB";
		default:
			return "Hard Drive not set";
		}
	}
	
	//returns monitor size as a String
	public String getMonitorSizeAsString()
	{
		switch(monitorSize){
		case MonitorSize_17:
			return "17 inch";
		case MonitorSize_19:
			return "19 inch";
		case MonitorSize_21:
			return "21 inch";
		default: 
			return "Monitor size not set";
		}
	}
	//returns total cost of RAM, hard drive, operating system and monitor
	public double getCost()
	{
		//the basic cost
		cost = 400;
		//if RAM = 4 then add 50 to the cost
		if(RAM == RAM_4_GB)
		{	
			cost = cost + 50;
		}
		//else if RAM = 8 then add 70 to the cost 
		else if(RAM == RAM_8_GB)
		{	//add 70 to cost
			cost = cost + 70;
		}
		//else if RAM = 16 then add 90 to the cost
		else if(RAM == RAM_16_GB)
		{	//add 90 to cost
			cost = cost + 90;
		}
		
		//if hard drive = 100 then add 60 to the cost
		if(hardDrive == HD_100_GB)
		{
			cost = cost+60;
		}
		//if hard drive = 200 then add 80 to the cost
		else if(hardDrive == HD_200_GB)
		{
			cost = cost+80;
		}
		//if hard drive = 300 then add 100 to the cost
		else if(hardDrive == HD_300_GB)
		{
			cost = cost+100;
		}
		//if operating system equals Windows then add 30 to the cost
		if(operatingSystem.equals(Windows))
		{
			cost = cost + 30;
		}
		//if operating system equals Apple then add 50 to the cost
		else if(operatingSystem.equals(Apple))
		{
			cost = cost + 50;
		}
		//if operating system equals Unix then add 70 to the cost
		else if(operatingSystem.equals(Unix))
		{
			cost = cost + 70;
		}
		//if monitor size = 17 then add 10 to the cost
		if(monitorSize == MonitorSize_17)
		{
			cost = cost + 10;
		}
		//if monitor size = 19 then add 20 to the cost
		else if(monitorSize == MonitorSize_19)
		{
			cost = cost + 20;
		}
		//if monitor size = 21 then add 30 to the cost
		else if(monitorSize == MonitorSize_21)
		{
			cost = cost + 30;
		}
		//returns the total cost
		return cost;
		
		
	}
	/*toString*/
	public String toString()
	{
		//can call a method inside another method if they are in the same class
		//without creating an object
		return "RAM: "+getRAMAsString()+
				"\nHard Drive: "+getHardDriveAsString()+
				"\nOperating System: "+operatingSystem+
				"\nMonitor Size: "+getMonitorSizeAsString()+"\n"+
				"Total cost: €"+getCost()+"\n";
	}
}
