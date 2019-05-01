package TryingHomework;

import java.util.Scanner;

public class HW153 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();// 7 words
		String[] words = new String[size]; // to array
		for (int i = 0; i < size; i++) {
			words[i] = scan.next();
		}
		printUniqueWords(words);
	}

	public static void printUniqueWords(String[] words) {
		// WRITE YOUR CODE HERE
		for (int i = 0; i < words.length; i++) {
			boolean isUnique = true;
			for (int k = 0; k < words.length; k++) {
				if (i != k) {
					if (words[i].equalsIgnoreCase(words[k])) {
						isUnique = false;
						break;
					}

				}

			}
			if (isUnique) {
				System.out.println(words[i]);
			}

		}

	}
}