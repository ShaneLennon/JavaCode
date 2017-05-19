package sheet2Methods;

public class Ex7CalcVol
{
	public static void main(String [] args)
	{
		Ex7CalcVol m = new Ex7CalcVol();
		double depth = 12.3;
		double width = 4.2;
		double breadth = 6.3;
	}
	
	public double calculateVolume(double d, double w, double b)
	{
		double volume = d*w*b;
		return volume;
	}
}