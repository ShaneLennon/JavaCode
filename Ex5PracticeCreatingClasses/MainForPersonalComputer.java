package Ex5PracticeCreatingClasses;

import java.util.concurrent.SynchronousQueue;

public class MainForPersonalComputer {

	public static void main(String[] args) 
	{
		PersonalComputer p1 = new PersonalComputer();
		System.out.println(p1);
		
		PersonalComputer p2 = new PersonalComputer(PersonalComputer.RAM_8_GB,PersonalComputer.HD_200_GB,PersonalComputer.Apple,PersonalComputer.MonitorSize_19);
		
		System.out.println(p2);
		
		PersonalComputer p3 = new PersonalComputer();
		
		p3.setRAM(PersonalComputer.RAM_16_GB);
		p3.setHardDrive(PersonalComputer.HD_300_GB);
		p3.setOperatingSystem("Apple");
		p3.setMonitorSize(PersonalComputer.MonitorSize_21);
		
		System.out.println(p3);
		
		System.out.println(p3.getRAMAsString());
		System.out.println(p3.getHardDriveAsString());
		System.out.println(p3.getOperatingSystem());
		System.out.println(p3.getMonitorSizeAsString());
		System.out.println("€"+p3.getCost());
		
		
		
		
	}

}
