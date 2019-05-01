package day30Methods2;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {
	public static void main(String[] args) {
		showMe5Numbers();
		showMe5Numbers();
		// while(true) {
		// showMe5Numbers();
		// }
		doPush10Ups();
		doPush10Ups();

		rangePrint();
	}

	public static void showMe5Numbers() {
		Random r = new Random();
		for (int i = 1; i <= 5; i++) {
			System.out.print(r.nextInt(1001) + " ");
		}
		System.out.println();// take it to new line
	}

	public static void doPush10Ups() {
		String push = "pushup";
		// int count = 0;
		for (int i = 1; i <= 10; i++) {
			// count++;
			System.out.println("Pushup - " + i);
		}
		System.out.println("Time to rest");
	}

	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();

		if (first < second) {
			for (int i = first; i <= second; i++) {
				System.out.print(i + " ");
			}
		} else if (first > second) {
			for (int k = first; k >= second; k--) {
				System.out.print(k + " ");
			}
		} else {
		System.out.println(first);

	}
	}
}
