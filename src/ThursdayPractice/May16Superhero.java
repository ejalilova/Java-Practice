package ThursdayPractice;

import java.util.Arrays;

public class May16Superhero {
	public static void main(String[] args) {

		String[] arr1 = { "word" };
		String[] arr2 = new String[2];
		String[] arr3 = new String[] { "apple", "kiwi" };
		arr2[0] = "word";
		arr2[0] = "new word";
		arr2[1] = "one more new word";
		System.out.println(Arrays.deepToString(arr2));

		String[] superheroes = { "Spiderman", "Iron man", "Hulk", "Wonder Woman", "Thor", "Batman", "Heckboy",
				"Superman", "Flash", "Captain America", "Anti-Man", "Aquaman" };
		// System.out.println(superheroes.length);
		// System.out.println(Arrays.toString(superheroes));
		// how many with space in the name?
		int count = 0;
		String list = "";
		for (String s : superheroes) {
			if (s.contains(" ")) {
				System.out.println((s));
				list = list + s + ", ";
				count++;
			}
		}
		System.out.println(count);
		System.out.println(list.substring(0, list.length() - 2));
		String[] newHeroes = list.split(", ");
		System.out.println(Arrays.toString(newHeroes));
	}
}
