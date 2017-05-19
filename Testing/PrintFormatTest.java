package Testing;

public class PrintFormatTest {

	public static void main(String[] args) 
	{
		int i1 = 1234567;
		int i2 = 12345;
		System.out.printf("%-21d %d\n",i1,i2);
		System.out.printf("%,-20d  %,d\n", i2,i2);
		System.out.format("%+-7d \n", i2);
		System.out.printf("%2$b + %1$5d\n", i1, false);
		
		System.out.printf("%1$d + %2$d", 123, 456);
	}

}
