package TryingHomework;

import java.util.Scanner;

public class HW105ArraysPrintFirstLastChar2 {
	public static void main(String[] args) {

		// Scanner input = new Scanner(System.in);
		// String[] words = { input.nextLine(), input.nextLine(), input.nextLine(),
		// input.nextLine(), input.nextLine() };
		String[] words = { "hello", "why", "by", "apple", "note" };

		// TODO: Write your code below

		String two = "";
		for (String word : words) {
			char first = word.charAt(0); // prints h w b a n
			char last = word.charAt(word.length() - 1);// print out o y y e e
			two = two + first + last + ", ";
		}
		two=two.substring(0,two.length()-2);
		System.out.println("[" + two + "]");
	
	}
}
/*for(int i = 0; i < words.length-1; i++) {
 * words = words[i].substring(0,1) + words[i].substring(words.length()-1);
 * System.out.print.ln(words);
 * 
 */
