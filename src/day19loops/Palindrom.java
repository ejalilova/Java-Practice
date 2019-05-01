package day19loops;
import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//1 reverse it and assign to different string
		//2 compare if it matches the word //check first and last char //check second and second from the end
		
		String word = scan.next();
		String reversed = "";
		
		//loop through word in reverse order and concatenate each character to reverse string
		//compare if word and reversed are equal
		
		int idx = word.length()-1;
		
		while(idx >= 0) {
		reversed = (reversed + word.charAt(idx));
		idx --;
		
		}
		System.out.println(reversed);
		
		if(reversed.equalsIgnoreCase(word)) {
		System.out.println("Polindrome");
	}else {
		System.out.println("It is not polindrome");
	}
		/*		int idx2 = word.length()-1; //5

		 * int idx2 = word.length()-1; //5
		
		while (idx2 >=0) {
			System.out.println(word.charAt(idx2));
			
			idx2 --;
		 * */
		
		 
		
		
		
	}

}
