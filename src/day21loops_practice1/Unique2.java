package day21loops_practice1;
import java.util.Scanner;
public class Unique2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter word:");
		
		String word = scan.next();
		String unique = "";
		
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			//System.out.println(letter);
			if (!unique.contains("" + letter)) {
				unique += letter;
				
			}
		
		}
		System.out.println(unique);
	}

}
//homework: rewrite get unique characters program to use substring method
