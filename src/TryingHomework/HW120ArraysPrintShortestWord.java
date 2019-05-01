package TryingHomework;

import java.util.Scanner;

public class HW120ArraysPrintShortestWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = { scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next() };

		// String shortestword = new String();

		int min = str[0].length();
		int idx = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < min) {
				min = str[i].length();
				idx = i;
			}

		}
		// System.out.printf(shortestword);

		System.out.println(str[idx]);
	}

}
