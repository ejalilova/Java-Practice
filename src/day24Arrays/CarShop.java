package day24Arrays;

import java.util.Arrays;

public class CarShop {
	public static void main(String[] args) {
//BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls Royce, Tesla
//1.create & array of strings & store cars inside that array
		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };
//2.print cars that starts with M
		for (int i = 0; i < cars.length - 1; i++) {
			if (cars[i].startsWith("M")) {
				System.out.println(cars[i]);
			}
//3.print all cars that have letter "r" in the name
//search case insensitive	

		}
		System.out.println("********************************");
		for (String make : cars) {
			if (make.toLowerCase().contains("r")) {
				System.out.println(make);
			}
		}
//4.print car names that ends with A
		System.out.println("********************************");
		for (String make : cars) {
			if (make.toLowerCase().endsWith("a")) {
				System.out.println(make);
			}
		}
//5.print all cars that have at least 6 letters
		System.out.println("********************************");
		for (String sixLetters : cars) {
			if (sixLetters.length() > 5) {
				System.out.println(sixLetters);
			}
		}
		//for(int i = 0; i < cars.length; i++) {
		//if (cars[i].length() >= 6) {
		//System.out.println(cars[i]);
//6.swap first and last value in the array
		System.out.println("********************************");
		String temp = cars[0];//BMW
		cars[0] = cars[cars.length-1];
		cars[cars.length-1] = temp;
		System.out.println(Arrays.toString(cars));
System.out.println("********************************");
System.out.println(Arrays.toString(cars));
Arrays.sort(cars);
System.out.println("After sorting");
System.out.println(Arrays.toString(cars));
	}

}
