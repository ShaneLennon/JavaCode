import javax.swing.JOptionPane;
public class DoingMaths
{
	public static void main(String [] args)
	{
		/*double num1 = -234;
		System.out.println(num1);
		double num2 = Math.abs(num1);
		System.out.println(num2);
		double num3 = Math.acos(0);
		System.out.println(num3);
		double num4 = Math.cbrt(729.0);
		System.out.println(num4);
		double num5 = Math.ceil(4445.7);
		System.out.println(num5);
		double num6 = Math.floor(4445.7);
		System.out.println(num6);
		System.out.println(Math.PI);
		System.out.println(Math.cos(Math.PI/6));
		System.out.println(Math.exp(10));
		System.out.println(Math.hypot(5,5));
		System.out.println(Math.pow(6.0,5.0));
		System.out.println(Math.round(Math.random()*365));
		double square = 1600;
		double squareRoot = Math.sqrt(square);
		
		int max = Math.max(12,18);
		System.out.printf("The max of 12 and 18 is %d\n ",max);
		System.out.printf("The square root of %.0f is %.5f\n: ",square,squareRoot);
		*/
		double radians = Math.PI/6;
		
		System.out.println("Angle in radians is "+radians);
		
		double degrees = Math.toDegrees(radians);
		
		System.out.println("Angle in degrees is "+degrees);
		
		DoingMaths m = new DoingMaths();
		
		String input1 = JOptionPane.showInputDialog("Please enter length of side a of triangle");
		double a = Double.parseDouble(input1);
		
		String input2 = JOptionPane.showInputDialog("Please enter length of side b of triangle");
		double b = Double.parseDouble(input2);
		
		String input3 = JOptionPane.showInputDialog("Please enter the angle c between sides a and b of triangle (in degrees)");
		double c = Double.parseDouble(input3);
		
		double radians2 = Math.toRadians(c);
		
		double areaTriangle = m.areaOfTriangle(a,b,radians2);
		
		JOptionPane.showMessageDialog(null, "The area of the triangle is "+areaTriangle, 
				"Nearly there", JOptionPane.PLAIN_MESSAGE);
				
		//System.out.println("Area of triangle is: "+areaTriangle);
		
		double areaTrapezium = m.areaOfTrapezium(4,2,9);
		System.out.println("Area of Trapezium is: "+areaTrapezium);
		
		double areaCircle = m.areaOfCircle(7);
		System.out.println("Area of Circle is: "+areaCircle);
		
		double volumeSphere = m.volumeOfASphere(1);
		System.out.println("Volume of Sphere is: "+volumeSphere);
		
		double cosAB = m.cosAPlusB(Math.PI/6,Math.PI);
		System.out.printf("Cos(A+B) = %.1f",cosAB);
	}
	
	public double areaOfTriangle(double sideA, double sideB, double angleC)
	{
		double area = (0.5*sideA*sideB)*Math.sin(angleC);
		return area;
	}
	
	public double areaOfTrapezium(double a, double b, double h)
	{
		double area = ((a+b)/2)*h; 
		return area;
	}
	
	public double areaOfCircle(double radius)
	{
		double area = Math.PI*(radius*radius);
		return area;
	}
	
	public double volumeOfASphere(double radius)
	{
		double volume = (4/3)*Math.PI*Math.pow(radius,3);
		return volume;
	}
	
	public double cosAPlusB(double a, double b)//a and b must be in radians
	{
		double add = Math.cos(a)*Math.cos(b) - Math.sin(a)*Math.sin(b);
		return add;
	}
}