package TuesdayWednMond;

import java.util.Scanner;

public class April17Practice {
	public static void main(String[] args) {
		String word = "javaclass";
		System.out.println(word.charAt(word.length() / 2));

		word = "javadays";
		String middle2 = (word.charAt(word.length() / 2 - 1) + "" + word.charAt(word.length() / 2));
		System.out.println(middle2);

		System.out.println(word.substring(3, 5));

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word, will give you middle one");
		String strInput = scan.next();
		//apple
		String m = "";
		if (strInput.length() % 2 == 0) {
			m = strInput.substring(strInput.length()/2-1, strInput.length()/2+1);
			System.out.println(m);
		} else {
			
			m = strInput.substring(strInput.length()/2, strInput.length()/2+1);
			System.out.println(m);
		}
		System.out.println("M: " + m);
	}

}
