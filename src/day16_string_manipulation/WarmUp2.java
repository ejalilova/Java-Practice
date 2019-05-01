package day16_string_manipulation;

import java.util.Scanner;

public class WarmUp2 {
	public static void main(String[] args) {

		String sentence = "I wrote [236] lines of code today.";

		int start = sentence.indexOf('[') + 1;
		int end = sentence.indexOf(']');

		String codeCount = sentence.substring(start, end);

		System.out.println("Lines of code: " + codeCount);

		System.out.println(sentence.substring(sentence.indexOf('[') + 1, sentence.indexOf(']')));

		// check if code count is more than 10

		int count = Integer.parseInt(codeCount);//convert (not casting) String to int

		if (count > 20) {
			System.out.println("Wrote more than 20 lines of code today!");
		} else {
			System.out.println("Not enough coding!");

		}
		

	}
}
