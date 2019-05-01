package day15string_manipulation;

import java.util.Scanner;

public class emojis2 {
	public static void main(String[] args) {

		// Scanner scan = new Scanner(System.in);
		// System.out.println("Please enter emoji: ");
		String emoji = ":)";

		if (emoji.length() != 2) {
			System.out.println("invalid emoji!");
			return;
		}

		char first = emoji.charAt(0);
		char second = emoji.charAt(1);

		if (first == ':') {
			if (second == ')') {
				System.out.println("Smile");
			} else if (second == '(') {
				System.out.println("sad");
			} else if (second == '/') {
				System.out.println("upset");
			} else if (second == 'p') {
				System.out.println("playful");
			} else {
				System.out.println("unknown emoji");
			}

		} else if (first == ';') {
			if (second == ')') {
				System.out.println("wink");
			} else if (second == '0') {
				System.out.println("surprised");
			} else {
				System.out.println("unknown emoji");

			}

		} else if (first == '(') {
			if (second == ':') {
				System.out.println("smile");
			} else {
				System.out.println("unknown emoji");
			}

		} else if (first == ')') {
			if (second == ':') {
				System.out.println("sad");
			} else {
				System.out.println("unknown emoji");
			}
		} else {
			System.out.println("invalid emoji");

		}
	}
}