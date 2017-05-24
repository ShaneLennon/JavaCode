/** 
 * Author: Sandra Hawkins
 * Date:   22 May 2017
 * ExerciseSolutions/sheet5Classes/MainForPC.java
 */ 

package Ex5PracticeCreatingClasses;




public class MainForPC {

	public static void main(String[] args) {

		System.out.println("Start of main.");
		
		/* When the following line executes because the PC class
		 * is mentioned, any static variables are given their values 
		 * and any static initialisation blocks will execute */
		System.out.println("Value of OS Solaris : " + PC.OS_SOLARIS);
		
		/* No-args constructor, defaults will be set */
		PC pc1 = new PC();
		
		/* All invalid values, defaults will be set */
		PC pc2 = new PC(10, 10, "Yes please", PC.MonitorSize.MONITOR_22);
		
		PC pc3 = new PC(PC.RAM_16_GB, PC.HARD_DRIVE_2_TB, PC.OS_LINUX, 
				        PC.MonitorSize.MONITOR_13);
		
		PC pc4 = new PC();
		pc4.setRam(PC.RAM_8_GB);
		pc4.setHardDrive(PC.HARD_DRIVE_2_TB);
		pc4.setMonitorSize(PC.MonitorSize.MONITOR_100);
		
		/* Put all PC objects into an array */
		PC [] allPcs = {pc1, pc2, pc3, pc4};
		
		printPCArray(allPcs);
		
	}
	
	/* This method take in an array of PC objects, loops through them
	 * and calls the toString() on each PC.
	 * */
	public static void printPCArray(PC [] arrayOfPCs) {
		/* Loop through and call the toString on each */
		for (PC onePc : arrayOfPCs)
			System.out.println(onePc);  // one.toString()
	}
}
