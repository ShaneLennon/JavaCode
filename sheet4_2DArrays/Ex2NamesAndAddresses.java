package sheet4_2DArrays;

import java.util.Scanner;

public class Ex2NamesAndAddresses {
	public static void main(String[] args) {
		String[][] namesAndAddresses = { { "Shane Lennon", "160 Shanliss Road", "Santry", "Dublin 9" },
				{ "Joe Murphy", "12 Main Street", "Finglas", "Dublin 11" },
				{ "Pat O'Connor", "26 South Main Street", "Wexford", "Co. Wexford" },
				{ "Joe Lennon", "251 Phibsboro Road", "Phibsboro", "Dublin 7" },
				{ "Paula Dunne", "The Square", "Donabate", "Co. Dublin" },
				{ "Barry Dunne", "23 Seatown Villas", "Swords", "Co. Fingal" },
				{ "Helen Dunne", "The Nevitt", "Ballyboghil", "Co. Dublin" },
				{ "Cathal O'Callaghan", "252 Griffith Avenue", "Drumcondra", "Dublin 9" } };

		for (int i = 0; i < namesAndAddresses.length; i++) {
			for (int j = 0; j < namesAndAddresses[i].length; j++) {
				System.out.print(namesAndAddresses[i][j] + " ");
			}
			System.out.println();
		}

		//System.out.println(namesAndAddresses.length);
		//System.out.println(namesAndAddresses[0].length);

		// row column
		// System.out.println(namesAndAddresses[0][0]);
		// row column
		// System.out.println(namesAndAddresses[1][0]);
		// row column
		// System.out.println(namesAndAddresses[2][0]);
		/*
		 * This creates an instance of the Scanner class and links it up to the
		 * console window, so that we can read in values from the console that
		 * the user has typed.
		 */
		Scanner input = new Scanner(System.in);

		// Prompt the user
		System.out.print("Please enter a name: ");
		String name = input.nextLine(); // double num = input.nextDouble();
		// System.out.println(name);

		for (int i = 0; i < namesAndAddresses.length; i++) {
			// row column
			if (namesAndAddresses[i][0].equals(name)) {
				for (int k = 1; k < namesAndAddresses[i].length; k++) {
					System.out.print(namesAndAddresses[i][k] + " ");
				}
				break;
			}
		}

	}

}
