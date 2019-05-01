package day23Arrays;
import java.util.Scanner;

public class SixWordsFromUser {
	public static void main(String[] args) {
		//take 6 words from user
		//concat words with comma
		//skip this word
		//print summary at the end of the programm
			
		Scanner scan = new Scanner(System.in);
		String word = "";
		String result = "";
		for(int i = 0; i < 2; i++) {
			System.out.println("Enter a letter: ");
			word = scan.next();
			if (word.contentEquals("java")) {
				continue;
			}
			result += word;
		}
		
		System.out.println("Result: " + result);
	}

}


