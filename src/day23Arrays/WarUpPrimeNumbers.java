package day23Arrays;

import java.util.Scanner;

public class WarUpPrimeNumbers {
	public static void main(String[] args) {
		// write a program that will verify if number is prime
		// Prime number is a whole number grater then 1 and cannot be made by
		// multiplying other whole numbers

		int number = new Scanner(System.in).nextInt();
		//int number = new Scanner(System.in)
		//int number = nextInt();
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("this is not a prime number");
				return;
			}
		}
		System.out.println("this is a prime number");
	}
}

