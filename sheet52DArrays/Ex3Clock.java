package sheet52DArrays;

public class Ex3Clock 
{
	public static void main(String[] args) 
	{
		for(int j = 0; j < 24; j++)
		{
			for(int k = 0; k < 60; k++)
			{
				for(int i = 0; i < 60; i++)
				{	
					System.out.printf("%02d : %02d : %02d\n",j,k,i);
					/*if(k == 60)
					{
						int l = 0;
						System.out.printf("%02d : %02d : %02d\n",j,l,i);
					}
					else
					{
						System.out.printf("%02d : %02d : %02d\n",j,k,i);
					}*/
				}
			}
			
		}
		System.out.println();
		
		

	}

}
