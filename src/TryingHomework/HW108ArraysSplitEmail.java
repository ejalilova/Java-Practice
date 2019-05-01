package TryingHomework;

import java.util.Scanner;

public class HW108ArraysSplitEmail {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String email = input.nextLine();
		// Write your code below
		int countOne = 0;
		if (!email.contains("@")) {
			System.out.println("invalid email");
		} else {

			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					countOne++;
					if (countOne > 1) {
						System.out.println("invalid email");
						return;
					}
				}
			}
			String emailId = email.substring(0, email.indexOf("@"));// info
			int dog = email.lastIndexOf("@");
			String emailDomain = email.substring(dog + 1, email.length());
			System.out.println("Email id: " + emailId);
			System.out.println("Email domain: " + emailDomain);
		}
	}
}
