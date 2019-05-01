package day21loops_practice1;
import java.util.Scanner;
public class Unique {
	public static void main(String[] args) {

		String word = "javva";
		String unique = "";

		char ch = word.charAt(0);// j
		System.out.println(unique.contains("" + ch));
		System.out.println(unique.indexOf(ch));
		if (!unique.contains("" + ch)) {
			unique += ch;

		}
		if (unique.indexOf(ch) == -1) {// if it is not there/-1 it cannot find it
			unique += ch;

		}
		System.out.println("Unique: " + unique);
		
		//=========================================
		String word2 = "bananas";
		String unique2 = "";
		
		int i =0;
		char ch2 = word2.charAt(i);
		System.out.println("Ch2: " + ch2);
		
		i = 1;
		ch2 = word2.charAt(i); // 
		System.out.println("Ch2: " + ch2);

		i++;;
		ch2 = word2.charAt(i); // 
		System.out.println("Ch2: " + ch2);
		
		//check if ch2 is in the unique2 variable
		//if (unique2.contains(ch))
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter word:");
		String word5 = scan.next();//javva 5
		String unique5 = "";
		for (int t = 0; t < word5.length(); t++) {
			System.out.print(t);// print t increases every time it loops - 1,2,3
			System.out.println(word5.charAt(t));
		}
		//System.out.println("Please enter word:");
		//String word6 = scan.next();
		//String unique6 = "";
		//for (int c = 0; c < word6.length(); c++) {
		//	char letter = word6.charAt(c);
		//	System.out.println(letter);
		
		
		//}
		
		
		
		
		
		
	}

}
