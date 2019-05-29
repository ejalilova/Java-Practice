package day39;

import java.util.ArrayList;

public class WarmUp {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");
		cities.add("Lima");
		// For each:
		for (String city : cities) {
			System.out.print(city + " | ");
		}
		// for loop:
		System.out.println();
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " | ");
		}
		System.out.println();
		// to string/print each city all uppercase
		System.out.println(cities.toString().toUpperCase());
		// make each city all uppercase
		String paris = cities.get(0).toUpperCase();
		cities.set(0, paris);
		System.out.println(cities.get(0));
		cities.set(1, cities.get(1).toUpperCase());
		for (int i = 0; i < cities.size(); i++) {
			String city = cities.get(i).toUpperCase();
			cities.set(i, city);
		}
		System.out.println(cities.toString());
		// find the longest and shortest city
		String shortestCity = "";
		String longestCity = "";
		for (String city : cities) {
			if (city.length() > longestCity.length()) {
				longestCity = city;
			}

		}
		shortestCity = cities.get(0);
		for (String city : cities) {
			if (city.length() < shortestCity.length()) {
				shortestCity = city;
			}

		}
		System.out.println(longestCity);
		System.out.println(shortestCity);

		ArrayList<String> citiesMoreThan6 = new ArrayList<>();
		// assign all cities that have more than 6 char
		for (String city : cities) {
			if (city.length() > 6) {
				citiesMoreThan6.add(city);
			}
		}
		System.out.println(citiesMoreThan6);
	}

}
