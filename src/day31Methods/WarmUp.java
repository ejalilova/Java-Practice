package day31Methods;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		countUp(5);
		int k = 4;
		countDown(k);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num to count up");
		int inputNum = scan.nextInt();
		countUp(inputNum);
	}
	public static void countUp(int num) {
		if (num < 1) {
			System.out.print("Invalid input");
		}
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			System.out.println();
		}
	}
	public static void countDown(int sum) {
		if (sum < 1) {
			System.out.println("Invalid input");
		}
		for (int k = sum; k >= 1; k--) {
			System.out.println(k + " ");
		}
		
	}
}
/*
 * create a class Counter 1) name: countUp return type: void param: int it
 * prints from 1 to the value of the param countUp(5); 1 2 3 4 5 param value
 * less than 1 then print "invalid input" 2) name countDown return type: void
 * param: int it prints from param value till 1 countDown(5); 5 4 3 2 1
 * countDown(0); "Invalid input"
 */