package Ex5PracticeCreatingClasses;



public class MainForDog2 {

	public static void main(String[] args) 
	{
		
		Dog2 d1 = new Dog2();
		System.out.println(d1);
		
		d1.setBreed("Border Collie");
		d1.setColour("black and white");
		d1.setOwnersName("Shane Lennon");
		
		System.out.println(d1);
		
		Dog2 d2 = new Dog2("Golden Retriever","Golden","Paula");
		
		System.out.println(d2);
		
		Dog2 d3 = new Dog2("Labrador", "Cream", "Helen Dunne");
		System.out.println();
		System.out.println(d3);
		
		System.out.println(d3.getColour());
		System.out.println(d3.getBreed());
		System.out.println(d3.getOwnersName());
		System.out.println(d1.getColour());
		System.out.println(d1.getOwnersName());
		d1.setColour("Pink");
		
		Dog2 d4 = new Dog2();
		System.out.println(d4);
	
	}

}
