package TryingHomework;

import java.util.Arrays;
import java.util.Scanner;

public class hw126 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for (int i = 0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for (int j = 0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		// WRITE YOUR CODE HERE

		boolean notFound;
		for (int i = 0; i < inner.length; i++) {
			notFound = true;
			for (int j = 0; j < outer.length && notFound; j++) {
				if (inner[i] == outer[j]) {
					notFound = false;
				}
				if (notFound) {
					System.out.println(false);
				}
				System.out.println(true);
			}

		}

	}
}