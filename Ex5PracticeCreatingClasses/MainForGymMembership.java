package Ex5PracticeCreatingClasses;

public class MainForGymMembership {

	public static void main(String[] args) 
	{
		GymMembership g1 = new GymMembership();
		System.out.println(g1);
		
		g1.setMembershipCost(700);
		g1.setPaymentFrequency(GymMembership.MONTHLYPAYMENT);
		
		System.out.println(g1);
		
		GymMembership g2 = new GymMembership(GymMembership.MONTHLYPAYMENT,1000,"Shane Lennon");
			
		System.out.println(g2);
		
		GymMembership g3 = new GymMembership(GymMembership.MONTHLYPAYMENT,560,"Sandra Hawkins");
		System.out.println(g3);
		
		
	}

}
