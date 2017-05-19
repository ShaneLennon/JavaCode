package Ex5PracticeCreatingClasses;

import java.util.concurrent.SynchronousQueue;

public class MainForPersonalComputer {

	public static void main(String[] args) 
	{
		//Create an instance of the class
		MainForPersonalComputer m = new MainForPersonalComputer();
		
		//Create an array to hold PersonalComputer objects
		PersonalComputer [] computers = new PersonalComputer[5];
		
		//Use set methods to set values to the member variables of that object
		//computers[0] is the first object in the computers array at index 0
		computers[0] = new PersonalComputer();
		computers[0].setRAM(PersonalComputer.RAM_4_GB);
		computers[0].setHardDrive(PersonalComputer.HD_100_GB);
		computers[0].setOperatingSystem(PersonalComputer.Windows);
		computers[0].setMonitorSize(PersonalComputer.MonitorSize_17);
		
		//Use set methods to set values to the member variables of that object
		//computers[1] is the second object in the computers array at index 1
		computers[1] = new PersonalComputer();
		computers[1].setRAM(PersonalComputer.RAM_8_GB);
		computers[1].setHardDrive(PersonalComputer.HD_200_GB);
		computers[1].setOperatingSystem(PersonalComputer.Apple);
		computers[1].setMonitorSize(PersonalComputer.MonitorSize_19);
		
		//Use set methods to set values to the member variables of that object
		//computers[2] is the third object in the computers array index 2
		computers[2] = new PersonalComputer();
		computers[2].setRAM(PersonalComputer.RAM_16_GB);
		computers[2].setHardDrive(PersonalComputer.HD_300_GB);
		computers[2].setOperatingSystem(PersonalComputer.Unix);
		computers[2].setMonitorSize(PersonalComputer.MonitorSize_21);
		
		//Use set methods to set values to the member variables of that object
		computers[3] = new PersonalComputer();
		computers[3].setRAM(PersonalComputer.RAM_8_GB);
		computers[3].setHardDrive(PersonalComputer.HD_100_GB);
		computers[3].setOperatingSystem(PersonalComputer.Windows);
		computers[3].setMonitorSize(PersonalComputer.MonitorSize_19);
		
		//Use set methods to set values to the member variables of that object
		computers[4] = new PersonalComputer();
		computers[4].setRAM(PersonalComputer.RAM_16_GB);
		computers[4].setHardDrive(PersonalComputer.HD_300_GB);
		computers[4].setOperatingSystem(PersonalComputer.Unix);
		computers[4].setMonitorSize(PersonalComputer.MonitorSize_17);
		
		//Using the instance of the class created above call the printComputers method
		//Pass the computers array to the method
		m.printComputers(computers);
		
		}//Method to print out the contents of the coputers array
		public void printComputers(PersonalComputer [] computers)
		{
			for(int i = 0; i < computers.length; i++)
			{
				System.out.println(computers[i]);
			}
		}

}
