package TryingHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HW101ArraysPrintFirstLastChar {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

//TODO: Write your code below //"hello", "why"
 		char lastCh;
 		char firstCh;
 		String result = "";
		for (int i = 0; i <= words.length -1; i++) {
			
			firstCh = words[i].charAt(0);
			
			lastCh = words[i].charAt(words[i].length() - 1);
			
			System.out.println(firstCh+""+ lastCh);
			
			
		}
		
		
	}
}
//String word4 = "ahahahdytgfj";
//char lastChar = word4.charAt(word4.length()-1);

/*Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print: 
       ho
       wy
       by
       ae
       ne
*/