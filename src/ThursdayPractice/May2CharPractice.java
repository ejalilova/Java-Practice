package ThursdayPractice;

import java.util.Arrays;

public class May2CharPractice {
	public static void main(String[] args) {
		String phoneNumber = "(240) 567 7834";
		char[] chars = phoneNumber.toCharArray();
		System.out.println(Arrays.toString(chars));
		System.out.println(chars.length);
		int digitCounter = 0;
		// isDigit method returns true if given char is digit
		for (char value : chars) {
			if (Character.isDigit(value)) {
				digitCounter++;
			}
		}
		System.out.println("Number of digits " + digitCounter);
		String name = "Mike";
		// to verify if name is valid
		boolean isValid = false;
		// for (char var : name.toCharArray()) {
		// }
		for (int i = 0; i < name.length(); i++) {
			char var = name.charAt(i);
			isValid = Character.isAlphabetic(var);
			if (isValid) {
				System.out.println(var + " : " + isValid);
			}
		}
	}

}
