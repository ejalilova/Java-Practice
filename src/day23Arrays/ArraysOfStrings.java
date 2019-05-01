package day23Arrays;

public class ArraysOfStrings {
	public static void main(String[] args) {
		byte[] bytesArray = new byte[3];
		String[] names = new String[5];
		String[] names2 = { "Shaun", "Roman", "Vlad", "Burak", "Maria" };

		System.out.println(names2[4]);
		System.out.println("Number of items: " + names2.length);
		String[] countries = {};
		countries[0] = "USA";

		// array has fixed size

		String[] fruits = new String[] { "apple", "orange" };
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

	}
}


