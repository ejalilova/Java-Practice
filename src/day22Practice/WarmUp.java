package day22Practice;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		// loop
		// enter month 1, enter month 5, enter month 15 print invalid month 15 and stop
		// the problem
		// less than 1 more 12
		Scanner scan = new Scanner(System.in);

		int month = 0;

		do {
			System.out.println("Please enter month: ");
			month = scan.nextInt();

		} while (month >= 1 && month <= 12);
		System.out.println("Invalid number " + month);

	}

}
