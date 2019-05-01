package TryingHomework;

import java.util.Scanner;

public class HasAJava {
	public static void main(String[] args) {
		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		// if (word > 0
		int idx = word.toLowerCase().indexOf("java");
		switch (idx) {
		case 0:
		case 1:

			System.out.println(true);
			break;
		default:
			System.out.println(false);

		}

		// if (idx == 0 || idx == 1) {
		// System.out.println(true);
		// } else {
		// System.out.println(false);
		// }

		/*
		 * switch (first) { case ':':
		 * 
		 * switch (second) { case ')': System.out.println("Smile"); break;
		 */
	}

}
