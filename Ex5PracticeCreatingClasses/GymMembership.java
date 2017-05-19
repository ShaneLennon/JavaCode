package Ex5PracticeCreatingClasses;

public class GymMembership 
{
	/*Member variables*/
	private int membershipNumber;
	private double membershipCost;
	private int paymentFrequency;
	private String membersName;
	
	/*Static / class variables*/
	public static final int PAY_AS_YOU_GO = 3;
	public static final int MONTHLYPAYMENT = 1;
	public static final int YEARLYPAYMENT = 2;
	private static int idCounter = 100;
	
	public GymMembership()
	{
		this.membershipNumber = idCounter;
		idCounter++;
		this.paymentFrequency = MONTHLYPAYMENT;
		this.membersName = "Shane";
	}
	
	public GymMembership(int paymentFrequency,double membershipCost,String name)
	{
		this();
		this.membershipCost = membershipCost;
		this.paymentFrequency = paymentFrequency;
		this.membersName = name;
	}
	
	public void setMembersName(String name)
	{
		this.membersName = name;
	}
	
	public String getMembersName()
	{
		return membersName;
	}
	//public void setMembershipNumber(int membershipNumber)
	//{
		//this.membershipNumber = membershipNumber;
	//}
	
	public int getMembershipNumber()
	{
		return membershipNumber;
	}
	
	public void setMembershipCost(int membershipCost)
	{
		this.membershipCost = membershipCost;
	}
	
	public double getMembershipCost()
	{
		return membershipCost;
	}
	
	public void setPaymentFrequency(int paymentFrequency)
	{
		this.paymentFrequency = paymentFrequency;
	}
	
	//public double calculateCost()
	//{
		
	//}
	public String getPaymentFrequencyAsString()
	{
		switch(paymentFrequency)
		{
			case MONTHLYPAYMENT:
				return "Monthly";
				
			case YEARLYPAYMENT:
				return "Yearly";
			default: return "Payment frequency not set";
		}
	}
	
	public double paymentPerMonth()
	{
		switch(paymentFrequency)
		{
			case MONTHLYPAYMENT:
				return membershipCost/12;
				
			case YEARLYPAYMENT:
				return 0;
			default: return 0;
		}
		
	}

	public String toString()
	{
		return String.format("Membership number : %d\nYearly membership cost: %.2f\nPayment frequency: %s\nPayment per month: %.2f\nMembers name is: %s\n ",membershipNumber,+membershipCost,getPaymentFrequencyAsString(),
				paymentPerMonth(),membersName);
		
	}
}
