package day37ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyCities {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Baku");

		for (String city : cities) {
			System.out.println(city + " ");
		}

		for (int i = 0; i < cities.size(); i++) {

			System.out.println(cities.get(i) + " ");

		}
		System.out.println();
		System.out.println("Removing Baku");
		cities.remove("Baku");
		System.out.println(cities.toString());
		//isEmpty?
		System.out.println("Is list empty? " + cities.isEmpty());
		cities.add(0, "Omsk");
		System.out.println(cities.toString());
		cities.add(1, "Ufa");
		System.out.println(cities.toString());
		cities.set(2, "Seoul");
		System.out.println(cities.toString());
		int idx = cities.indexOf("Sterling");
		cities.set(idx, "Odessa");
		System.out.println(cities.toString());
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println(empty);
	}
}
