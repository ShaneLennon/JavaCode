package Ex5PracticeCreatingClasses;

public class EmailAccount 
{
	//member variables
	private String emailAddress;
	private String password;
	private int maxStorageLimit;
	
	public static final int MAX_STORAGE_LIMIT_100_GB = 100;
	public static final int MAX_STORAGE_LIMIT_500_GB = 500;
	public static final int MAX_STORAGE_LIMIT_1_TB = 1;
	
	public EmailAccount()
	{
		maxStorageLimit = MAX_STORAGE_LIMIT_100_GB;
	}
	
	public EmailAccount(String emailAddress, String password, int maxStorageLimit)
	{	
		this();
		setEmailAddress(emailAddress);
		setPassword(password);
		setMaxStorageLimit(maxStorageLimit);
	}
	
	public void setEmailAddress(String emailAddress)
	{
		/* [\\w.]+   		One or more word characters including .
		 * @				followed by an @
		 * [\\w-]+			followed by one or more word characters,
		 * 					a hyphen is allowed in the company name
		 * 					e.g. name@my-company.com
		 * \\.				followed by . as in .com
		 * [a-zA-Z]{2,}		followed by 2 or more letters (a to z)
		 * 
		 * 
		 * \w means a word character in Regex, because \ has special 
		 * meaning in a String in Java, e.g. "\n" or "\t", you must
		 * insert a second \ to remove the meaning of the \ in Java.
		 *
		 **/
		 String regex = "[\\w.]+@[\\w-]+\\.[a-zA-Z]{2,}";
		//if(emailAddress.contains("@") && emailAddress.contains(".") && (emailAddress.indexOf("@") < emailAddress.lastIndexOf(".")))
		//{
			//this.emailAddress = emailAddress;
		//}
		if(emailAddress.matches(regex))
		{
			this.emailAddress = emailAddress;
		}
		else
		{
			System.out.println("The email address you entered is invalid");
		}
	}
	
	public void setPassword(String password)
	{
		String regex = "(?=.*[a-z])(?=.*[A-Z]).{5,20}";
		
		//if(password.length() >= 5 && password.length() <= 20)
		//{
			//this.password = password;
		//}
		//if (password.length() >= 5 && password.length() <= 20)
		if (password.matches(regex))
		{
			this.password = password;
		}
		else
		{
			System.out.println("Password is too long");
		}
	}
	
	public void setMaxStorageLimit(int maxStorageLimit)
	{
		switch(maxStorageLimit){
			case MAX_STORAGE_LIMIT_100_GB:
			case MAX_STORAGE_LIMIT_500_GB:
			case MAX_STORAGE_LIMIT_1_TB:
				this.maxStorageLimit = maxStorageLimit;
				break;
				
			default:
				System.out.println("Invalid storage limit, setting to 100 GB");
				this.maxStorageLimit = MAX_STORAGE_LIMIT_100_GB;
				break;
		}
	}
	
	public String getEmailAddress()
	{
		return emailAddress;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public int getMaxStorageLimit()
	{
		return maxStorageLimit;
	}
	
	private String getMaxStorageLimitAsString()
	{
		switch(maxStorageLimit){
		case MAX_STORAGE_LIMIT_100_GB:
			return "100 GB";
		case MAX_STORAGE_LIMIT_500_GB:
			return "500 GB";
		default:
			return "1 TB";
		}
	}
	
	public String toString()
	{
		return "Email Address: "+emailAddress+
				"\nPassword: "+password+
				"\nStorage Limit: "+maxStorageLimit +
				((maxStorageLimit == MAX_STORAGE_LIMIT_1_TB) ? "TB" : "GB")+"\n";
	}
	
}
