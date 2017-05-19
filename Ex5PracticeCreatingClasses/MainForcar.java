package Ex5PracticeCreatingClasses;

public class MainForcar {

	public static void main(String[] args) 
	{
		MainForcar c2 = new MainForcar();
		
		Car c1 = new Car();
		
		System.out.println(c1);
		
		c1.setMake("Toyota");
		c1.setModel("Corolla");
		c1.setEngineSize(2.2);
		
	Car [] cars = new Car[5];
		
		cars[0] = new Car();
		cars[0].setMake("Audi");
		cars[0].setModel("TT");
		cars[0].setEngineSize(1.0);
		//System.out.println(cars[0]);
		
		cars[1] = new Car();
		cars[1].setMake("Toyota");
		cars[1].setModel("Corolla");
		cars[1].setEngineSize(2.0);
		
		cars[2] = new Car();
		cars[2].setMake("Mitsubishi");
		cars[2].setModel("Colt");
		cars[2].setEngineSize(1.5);
		
		cars[3] = new Car();
		cars[3].setMake("Ford");
		cars[3].setModel("Focus");
		cars[3].setEngineSize(1.2);
		
		cars[4] = new Car();
		cars[4].setMake("Honda");
		cars[4].setModel("Civic");
		cars[4].setEngineSize(2.3);
		
		c2.printCars(cars);
		
		}
		public void printCars(Car [] cars)
		{
			for(int i = 0; i < cars.length; i++)
			{
				System.out.println(cars[i]);
			}
		}
}
