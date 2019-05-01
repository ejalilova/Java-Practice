package Day35Practice;

public class Encripted {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";
		String word = "easter";
		// get a char from word
		// find indexOf the char in alphabet
		// read the char from encrypted at that index
		// add to some string

		char first = word.charAt(0);// e
		int position = alphabet.indexOf(first); // 4
		System.out.println("position " + position);
		char enChar = encrypted.charAt(position);
		System.out.println(first + " --> " + enChar);
		String encryptedWord = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			// find in alpabet
			int index = alphabet.indexOf(ch);
			System.out.println(encrypted.charAt(index));
			encryptedWord += encrypted.charAt(index);
		}
		System.out.println(word);
		System.out.println(encryptedWord);
	}
}
