package TryingHomework;

import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {

		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String star = "*";

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				System.out.print(star);

				star += "*";
				i++;
				System.out.println();
			}
		}
	}
}
