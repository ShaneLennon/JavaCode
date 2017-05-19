package sheet2Methods;

public class Ex4CalcVol
{
	public static void main(String [] args)
	{
		Ex4CalcVol m = new Ex4CalcVol();
		
		double depth = 12.3;
		double width = 4.2;
		double breadth = 6.3;
		m.calculateVolume(depth,width,breadth);
	}
	
	public void calculateVolume(double d, double w, double b)
	{
		double volume = d*w*b;
		System.out.println("The Volume is "+volume);
	}
}