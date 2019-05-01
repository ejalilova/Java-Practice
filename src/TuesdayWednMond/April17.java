package TuesdayWednMond;

import java.util.Scanner;

public class April17 {
	public static void main(String[] args) {
		String word = "javaclass";
		System.out.println(word.charAt(word.length()/2));
		
		word = "javadays";
String middle2 = word.charAt(word.length()/2-1) +""+
				word.charAt(word.length()/2);

System.out.println(word.substring(3,5));

System.out.println(word.substring(word.length()/2-1, word.length()/2+1));
		
		System.out.println("Middle 2: " + middle2);
		
		String middleTwo = word.substring(3, 5);
		System.out.println(middleTwo);
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter word, will provide middle");
		String strInput = scan.next();
		String m = "";
		if (strInput.length() % 2 == 0) {
			m = strInput.substring(strInput.length()/2-1, strInput.length()/2+1);
		} else {
			m = strInput.substring(strInput.length()/2, strInput.length()/2+1);
			
		}
		System.out.println("M: " + m);
	}

}
