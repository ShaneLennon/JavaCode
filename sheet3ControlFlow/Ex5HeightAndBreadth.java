package sheet3ControlFlow;
public class Ex5HeightAndBreadth
{
	public static void main(String [] args)
	{
		Ex5HeightAndBreadth m = new Ex5HeightAndBreadth();
		double height = 12;
		double breadth = 12;
		
		m.areaAndPerimeter(height,breadth);
		
		
	}
	
	public void areaAndPerimeter(double height, double breadth)
	{
		double area = height*breadth;
		double perimeter = 2*height + 2*breadth;
		
		if(height == breadth)
		{
			System.out.printf("The area and perimeter of the square are %.1f and %.1f",area,perimeter);
		}
		else
		{
			System.out.printf("The area and perimeter of the rectangle are %.1f and %.1f",area,perimeter);
		}
	}
}