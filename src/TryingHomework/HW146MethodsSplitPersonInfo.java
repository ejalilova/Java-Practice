package TryingHomework;

import java.util.Scanner;

public class HW146MethodsSplitPersonInfo {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String s = inp.next();
		person(s);
	}

	public static void person(String info) {

		// your code here
		String[] words = info.split(",");
		System.out.print("person name: " + words[0] + " last name: " + words[1] + " age: " + words[2]);

	}// end person

}
