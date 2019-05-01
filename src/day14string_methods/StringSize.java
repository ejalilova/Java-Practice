package day14string_methods;

public class StringSize {
	public static void main(String[] args) {
		String str1 = "Good morning";
		// check if matches "Good morning and print match or not match
		// convert to All upper case and print

		if (str1.equals("Good morning")) {
			System.out.println("Match");
		} else {
			System.out.println("Not match");
		}

		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		} else {
			System.out.println("Not Match - ignore case");
		}

		System.out.println(str1.toUpperCase());
		System.out.println((str1));// it satys as old value, not uppercase

		str1 = str1.toUpperCase();
		System.out.println("After assignment: " + str1);

		// combine the above methods together:
		// convert to all lower case first then check if equals ("good morning")

		if (str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained method: match");

		} else {
			System.out.println("Chain methods: do not match");

		}
		// find out how many characters in the string
		String myName = "Evgenia";
		System.out.println(myName.length());
		System.out.println(myName);

		int length = myName.length();
		System.out.println("My name's length:" + length);

		// user names must be exactly 8 characters // good characters
		String userName = "Murodili";

		if (userName.length() == 8) {
			System.out.println("Good characters");
		} else {
			System.out.println("Must be 8 characters");

		}
		// password must be at least 6 characters
		String password = "woodenSpoon";
		if (password.length() >= 6) {
			System.out.println("Password is good");
		} else {
			System.out.println("Password is to short");

			int passwordLength = password.length();
			passwordLength = 7;
			if (passwordLength < 6) {
				System.out.println("Invalid password. Too short");
			} else {
				System.out.println("Valid password, good job");

			}   
		}
	}
}
