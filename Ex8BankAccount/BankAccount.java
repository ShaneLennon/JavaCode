package Ex8BankAccount;

import java.util.concurrent.SynchronousQueue;

public class BankAccount 
{
	/*Member variables*/
	private String name;
	private String address;
	private int accountNumber;
	private double balance;
	
	//class variables
	public static double currentInterestRate = 7;
	public static int numBankAccounts;
	public static int accountNum = 40005100;
	
	//Constructors
	public BankAccount()
	{
		accountNumber = accountNum;
		accountNum++;
		numBankAccounts++;
	}
	
	public BankAccount(String name, String address,double depositAmount)
	{
		this();
		setName(name);
		setAddress(address);
		depositMoney(depositAmount);
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}

	 //setters
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void depositMoney(double amount)
	{
		this.balance = this.balance + amount;
	}
	
	public void withdrawMoney(double amount)
	{
		if(this.balance - amount < 0)
		{
			System.out.println("You cannot be overdrawn. You can withdraw €"+this.balance);
		}
		else
		{
			this.balance = this.balance - amount;
		}
	}
	
	public void checkBalance()
	{
		System.out.println(String.format("Balance %,.2f",balance));
		
	}
	
	public void addInterest()
	{
		this.balance = this.balance + this.balance*(currentInterestRate/100);
	}
	
	public void withdrawAllMoney()
	{
		System.out.println("You have withdrawn all of your money. That is "+this.balance);
		this.balance = 0;
	}
	
	public String toString()
	{
		return String.format("Name %s\nAddress %s\nAccount number %d\nBalance %,.2f\n",name,address,accountNumber,balance );
	}
}
