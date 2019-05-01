package day15string_manipulation;

public class Contains {
	public static void main(String[] args) {
		String email = "test@gmail.com";

		System.out.println(email.contains("@"));

		String list = "potatoes, apples tomatoes, eggs, milk, bread, cereal, meat";

		if (list.contains("apples")) {
			System.out.println("apples are there!");
		} else {
			System.out.println("Lets add aplles!");
		}

		boolean hasEggs = list.contains("eggs");

		System.out.println("Contains eggs: " + hasEggs);

		boolean hasCucumbers = list.toLowerCase().contains("cucumbers");

		System.out.println("Contains cucumbers: " + hasCucumbers);

		email = "name@yahoo.com";

		if (email.contains("yahoo")) {
			System.out.println("It is yahoo email");
		} else if (email.contains("gmail")) {
			System.out.println("gmail account");
		} else if (email.contains("@hotmail")) {
			System.out.println("hotmail");
		}

		String etsyTitle = ("Wooden spoon | Etsy");
		if (etsyTitle.contains(" | ")) {
			System.out.println("pipe is there");
		} else {
			System.out.println("not there");
		}

		String name = "Evgenia";

		if (name.contains("a") || name.contains("e")) {
			System.out.println("'a' or 'e' is present");
		} else {
			System.out.println("'a' or 'e' is missing");
		}
	}

}
