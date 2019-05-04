package day19loops;

import java.util.Random;
import java.util.Scanner;

public class GuessANumberHW {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Random random = new Random(); // used to generate random numbers

		// String word = scan.next();
		System.out.println("### WELCOME TO GUESS A NUMBER GAME ###"); // will give us number between 0 and 100

		int secretNumber = random.nextInt(101);
		int guessNumber;

		int count = 1; // was not there before

		do {

			System.out.println("Guess a number: " + count);
			guessNumber = scan.nextInt();
			if (guessNumber < secretNumber) {
				System.out.println("Your number is to small");
			} else if (guessNumber > secretNumber) {
				System.out.println("Your number is too large");

			}
		} while (guessNumber != secretNumber && count++ < 5);
		if (guessNumber == secretNumber) {
			System.out.println("Bingo, congratulastions, you won!");

		} else {

			System.out.println("You had 5 attempts and did not win");
		}

	}
}
