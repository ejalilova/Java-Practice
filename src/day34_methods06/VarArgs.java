package day34_methods06;

import java.util.Arrays;

public class VarArgs {
	public static void main(String... args) {
		printWords("red", "blue");
		printWords("grey");
		printWords();
		String[] myPets = {"cat", "horse", "dog", "sheep", "goat"};
		printWords(myPets);
		
		System.out.println(sumOfNum(5, 7, 19, 4, 7));
		int  budget = 200;
		if (sumOfNum(10, 45, 110, 30) <= budget) {
			System.out.println("Within budget");
		} else {
			System.out.println("Not");
		}
		int total = sumOfNum(234, 56, 87, 89, 4);
		System.out.println("total: " + total);
		
		cook("Burrito Bowl", "Rice", "Beans", "Sour Cream", "Cheese", "Salsa");
		cook("Avacado Tost", "Avocado", "Sunny Side Eggs", "Wheat Toast");
		shoppingList(1000, "Avocado Toast", "Watch", "Shoes");
	}

	public static void printWords(String... words) {
		for (String w : words) {
			System.out.println(w);
		}
	}
	public static int sumOfNum(int... nums) {
		int sum = 0;
		for (int n : nums) {
			sum += n;
		}
		
		return sum;
	}
	public static void cook(String name, String... ings) {
		System.out.print("Food: " + name);
		System.out.println(Arrays.toString(ings));
	}
	public static void shoppingList(int totalPrice, String ... items) {
		System.out.println("Total cost: " + totalPrice);
		System.out.println(Arrays.toString(items));
	}
}
