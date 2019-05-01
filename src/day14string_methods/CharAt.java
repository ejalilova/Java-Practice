package day14string_methods;

public class CharAt {
	public static void main(String[] args) {
		String word = "Computer";
		// print all characters one by one

		// TODO Auto-generated method stub

		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));

		// string word2 and check if first character is 'J'

		String word2 = "Java";
		if (word2.charAt(0) == 'J') {
			System.out.println("J");
		} else {
			System.out.println("no J");
		}
		// string word 3 that consists of 5 characters
		// check if first and last characters are same
		// true - "First and last match"
		// false - "First and last are different"

		String word3 = "happy";
		char first = word3.charAt(0);
		char last = word3.charAt(4);

		if (first == last) {
			System.out.println("First and last match");
		} else {
			System.out.println("First and last are different");
		}
		String word4 = "ahahahdytgfj";
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("Last value of " +  word4 + " is: " + lastChar);
		
	}
}
