package Ex5PracticeCreatingClasses;

import java.util.concurrent.SynchronousQueue;

public class MainForEmailAccount {

	public static void main(String[] args)
	{
		EmailAccount e1 = new EmailAccount();
		System.out.println(e1);
		
		EmailAccount e2 = new EmailAccount("shanelennon7blue@gmail.com","5ceuewuf",EmailAccount.MAX_STORAGE_LIMIT_500_GB);
		System.out.println(e2);
		
		EmailAccount e3 = new EmailAccount();
		
		e3.setEmailAddress("shane.lennon7@mail.dcu.ie");
		e3.setPassword("rage2005");
		e3.setMaxStorageLimit(EmailAccount.MAX_STORAGE_LIMIT_1_TB);
		
		System.out.println(e3);
	}

}
