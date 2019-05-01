package day15string_manipulation;

import java.util.Scanner;

public class emojis {

	public static void main(String[] args) {

		String emoji = "(:";

		if (emoji.length() != 2) {
			System.out.println("invalid emoji!");
			return;
		}

		char first = emoji.charAt(0);
		char second = emoji.charAt(1);

		switch (first) {
		case ':':

			switch (second) {
			case ')':
				System.out.println("Smile");
				break;
			case '(':
				System.out.println("Sad");
				break;
			case '/':
				System.out.println("Upset");
				break;
			case 'p':
				System.out.println("Playful");
				break;
			default:
				System.out.println("Unknown emoji");
				break;
			}
		}
		switch (first) {
		case ';':
			switch (second) {
			case ')':
				System.out.println("Wink");
				break;
			case '0':
				System.out.println("surprised");
				break;
			default:
				System.out.println("Unknown emoji");
				break;
			}
		}
		switch (first) {
		case '(':
			switch (second) {
			case ':':
				System.out.println("Smile");
				break;
			default:
				System.out.println("Unknown emoji");
				break;
			}
		}
		switch (first) {
		case ')':
			switch (second) {
			case ':':
				System.out.println("sad");
				break;
			default:
				System.out.println("Unknown emoji");
				break;
				//default:
			//	System.out.println("Invalid emoji");
			//	break;
			}
		
		}

	}
}