package TryingHomework;

import java.util.Scanner;

public class HW154Methods16CheckIfNumPolind {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		isPalindrome(num);
	}

	public static void isPalindrome(int num) {
		// WRITE YOUR CODE HERE
		int reversedInteger = 0, remainder, originalInteger;        originalInteger = num;

		while (num != 0) {
			remainder = num % 10;
			reversedInteger = reversedInteger * 10 + remainder;
			num /= 10;
		}

		if (originalInteger == reversedInteger)
			System.out.println(originalInteger + " is a palindrome.");
		else
			System.out.println(originalInteger + " is not a palindrome.");
	}
}