package day30Methods2;

import java.util.Scanner;

public class WarmUpMethods {
	public static void main(String[] args) {
		print5Stars();
		// call print5Stars 100 times
		for (int i = 0; i < 100; i++) {
			print5Stars();
		}
		introduce();
		introduce();
	}

	public static void print5Stars() {
		System.out.println("* * * * *");
	}

	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Nice to meet you, " + name);
	}
}
