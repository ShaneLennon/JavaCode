package Ex8BankAccount;

import java.util.concurrent.SynchronousQueue;

public class MainForBankAccount {

	public static void main(String[] args) 
	{
		BankAccount b1 = new BankAccount();
		System.out.println(b1);
		
		BankAccount b2 = new BankAccount("Shane Lennon","160 Shanliss Road",100);
		System.out.println(b2);
		
		b2.depositMoney(1400);
		System.out.println(b2);
		
		b2.withdrawMoney(1401);
		
		//b2.withdrawAllMoney();
		//System.out.println(b2);
		
		b2.addInterest();
		System.out.println(b2);
		
		b2.checkBalance();
		
		BankAccount b3 = new BankAccount("Colin Lennon","160 Shanliss Road",500);
		
	
		System.out.println(b3);
		
		b3.addInterest();
		System.out.println(b3);
		
		b3.withdrawMoney(500);
		
		System.out.println(b3);
		b3.addInterest();
		b3.setName("Cathal O' Callaghan");
		b3.setAddress("254 Griffith Avenue");
		b3.depositMoney(35000);
		System.out.println(b3);
		b3.checkBalance();
		System.out.println(b3.getAccountNumber());
		System.out.println(BankAccount.numBankAccounts);
	}

}
