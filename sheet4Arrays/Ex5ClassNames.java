package sheet4Arrays;
public class Ex5ClassNames
{
	public static void main(String [] args)
	{
		String [] firstNames = {"Shane","Ben","Luca","Janos","James","Ewelina","Asen","Darius","Damien","Vitalie","Pat","Sean","Stephen","Emmanuel"};
		String [] lastNames = {"Lennon","Deegan","Statella","Szabo","Hickey","Dziedzina","Evtimov","Peciulis","Sheehy","Brescamu","Flynn","Masterson","Gregan","Akrinrintoyo"};
		
		for(int i = 0; i < firstNames.length; i++)
		{
			System.out.println(firstNames[i]+"\t\t"+lastNames[i]);
		}
		
		String [] fullNames = new String[14];
		
		for(int i = 0; i < 14; i++)
		{
			fullNames[i] = firstNames[i]+"\t\t"+lastNames[i];
		}
		
		for(int i = 0; i < firstNames.length; i++)
		{
			System.out.println(fullNames[i]);
		}
	}
}