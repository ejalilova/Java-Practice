package TryingHomework;

import java.util.Scanner;

public class PrefixAgain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		int count = 0;

		String prefix = str.substring(0, n);
		System.out.println(prefix);
		for (int i = 0; i < str.length() - n; i++) {
			System.out.println(str.substring(i, i + n));
			if (str.substring(i, i + n).equals(prefix)) {
				count++;
			

			}
		}

		System.out.println(count > 1);

	}

}
