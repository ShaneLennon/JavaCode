package Ex6ArraysOfObjects;

public class Car
{
	private String make;
	private String model;
	private double engineSize;
	private int carNumber;
	public static int carCounter;
	//Constructors
	public Car()
	{
		carNumber = carCounter;
		carCounter++;
	}
	
	public Car(String make, String model, double engineSize)
	{
		this();
		setMake(make);
		setModel(model);
		setEngineSize(engineSize);
	}
	//Setters
	public void setMake(String make)
	{
		switch(make)
		{
			case "Audi":
			case "Toyota":
			case "Mitsubishi":
			case "Ford":
			case "Honda":
			case "Alpha Romeo":
			case "BMW":
			case "Mercedes":
			case "Volkswagen":
			case "Opel":
				 this.make = make;
				 break;
			default:
				 System.out.println(make + " is not a valid make");
				 break;
		}
	}
	
	public void setModel(String newModel)
	{
		model = newModel;
	}
	
	public void setEngineSize(double size)
	{
		if(size >= 1 && size <= 2.3)
			this.engineSize = size;
		else
			System.out.println(size +" is not a valid engine size");
	}
	//getters
	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public double getEngineSize()
	{
		return engineSize;
	}
	
	public int getCarNumber()
	{
		return carNumber;
	}
	
	public String toString()
	{
		return String.format("Make of the car is %s\nModel of the car is %s\nEngine size of the car is %.1f\nCar Number %d \n",make,model,engineSize,carNumber);
	}
}
