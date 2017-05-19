package Ex5PracticeCreatingClasses;

public class Dog2 
{
	/*Member variables will be private. They can only be accessed through public methods in this class, known as accessor methods.
	 * Encapsulation: */
	private String breed;
	private String colour;
	private String ownersName;
	
	/*Static variables / class variables */
	public static int dogCounter;
	
	public Dog2()
	{
		dogCounter++;
	}
	
	public Dog2(String breed, String colour, String ownersName)
	{
		this();
		setBreed(breed);
		setColour(colour);
		setOwnersName(ownersName);
	}
	
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	public void setColour(String colour)
	{
		if(colour.equalsIgnoreCase("pink"))
		{
			System.out.println("Pink is not a dogs colour");
		}
		else
		{
			this.colour = colour;
		}
	}
	
	public void setOwnersName(String ownersName)
	{
		if(ownersName.length() > 10)
		{
			System.out.println("The owners name is too long");
			this.ownersName = ownersName.substring(0,5);
		}
		else
		{
			this.ownersName = ownersName;
		}
	}
	
	public String getBreed()
	{
		return this.breed;
	}
	
	public String getColour()
	{
		return this.colour;
	}
	
	public String getOwnersName()
	{
		return this.ownersName;
	}
	
	public String toString()
	{
		return "Breed of the dog is "+breed +
				"\nColour of the dog is "+colour +
				"\nOwner's name is "+ownersName+
				"\nDog count is "+Dog2.dogCounter+"\n";
	}
}
