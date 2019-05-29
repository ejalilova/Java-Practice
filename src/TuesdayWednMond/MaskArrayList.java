package TuesdayWednMond;

import java.io.*;
import java.util.*;

public class MaskArrayList {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<String> inputs = new ArrayList<>();
		List<String> masked = new ArrayList<>();
		List<Integer> lengthList = new ArrayList<>();

		String answer = "";
		do {

			System.out.println("Enter word");
			String word = scan.next();
			inputs.add(word);
			// System.out.println(maskWords("Wonderfull"));
			masked.add(maskWords(word));
			lengthList.add(word.length());
			System.out.println("You want to add another word?");
			answer = scan.next();

		} while (answer.equalsIgnoreCase("y"));

		System.out.println(inputs.toString());
		System.out.println(masked.toString());
		System.out.println(lengthList.toString());
	}

	public static String maskWords(String word) {
		String stars = "";
		for (int i = 1; i < word.length(); i++) {
			stars += "*";
		}
		return stars;
	}
}