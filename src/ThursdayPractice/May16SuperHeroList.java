package ThursdayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class May16SuperHeroList {
	public static void main(String[] args) {
		// SuperHero object = new SuperHero();
		ArrayList<String> superheroes = new ArrayList<>();
		// superheroes.addAll(Arrays.asList("Spiderman", "Iron man", "Hulk", "Wonder
		// Woman", "Thor", "Batman", "Heckboy",
		// "Superman", "Flash", "Captain America", "Anti-Man", "Aquaman"));
		superheroes.add("Iron man");
		superheroes.add("Hulk");
		superheroes.add("Wonder Woman");
		superheroes.add("Thor");
		superheroes.add("Batman");
		superheroes.add("Hellboy");
		superheroes.add("Superman");
		superheroes.add("Flash");
		superheroes.add("Captain America");
		superheroes.add("Ant-Man");
		superheroes.add("Aquaman");

		System.out.println(superheroes);
		System.out.println(superheroes.size());
		ArrayList<String> list = new ArrayList<>();
		String name = "";
		for (String s : superheroes) {
			if (s.contains(" ")) {
				list.add(s);
				System.out.println(s);
			}
			if (s.length() > name.length()) {
				name = s;
			}
		}
		System.out.println(list);
		System.out.println(name);
		// how to find second longest word
		String secondLongest = "";

		for (String s : superheroes) {
			if (!s.equals(secondLongest)) {
				if (s.length() > secondLongest.length()) {
					secondLongest = s;
				}
			}
		}
		System.out.println(secondLongest);
	}
}
