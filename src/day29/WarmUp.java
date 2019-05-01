package day29;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		// String [][] capitals = new String [9][2];
		String[][] countriesArray = { { "USA", "Washington DC" }, { "Canada", "Ottawa" }, { "Mexico", "Mexico City" },
				{ "Brasil", "Brasilis" }, { "Peru", "Lima" }, { "Argentina", "Boanes Aeros" }, { "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, { "Kazakhstan", "Nursultan" } };

		System.out.println(countriesArray[0][0] + " | " + countriesArray[0][1]);
		System.out.println(countriesArray[8][0] + " | " + countriesArray[8][1]);
		System.out.println(Arrays.deepToString(countriesArray));
		// System.out.println(countriesArray.length);
		for (int i = 0; i < countriesArray.length; i++) {
			System.out.print(countriesArray[i][0] + " | ");
		}
		System.out.println();
		for (String[] country : countriesArray) {
			System.out.print(country[0] + " | ");
		}
		System.out.println();
		// get all the Cities and add to cities[] array
		String[] cities = new String[countriesArray.length];
		// null means no object, not same as empty string
		System.out.println(Arrays.toString(cities));
		for (int i = 0; i < countriesArray.length; i++) {
			cities[i] = countriesArray[i][1];

		}
		System.out.println(Arrays.toString(cities));
		// look for Bolivia in the countriesArr and test if capital city is La Paz
		for (int row = 0; row < countriesArray.length; row++) {
			if (countriesArray[row][0].equals("Bolivia")) {
				// System.out.println(countriesArray[row][1]);
				if (countriesArray[row][1].equals("La Paz")) {
					System.out.println("Bolivia test passed");
				} else {
					System.out.println("Failed");
				}
				break;
			}

		}
	}
}