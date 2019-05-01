package day21loops_practice1;
import java.util.Scanner;
public class WarmUp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//int first = scan.nextInt();
		//int second = scan.nextInt();
		int sum = 0;
		/*
		 * Ask user to enter 2 ints:
		- if sum of those ints is not more than 100, then keep asking for 2 nums
		- once sum of those 2 numbers is more than 100 then 
		Print "Good Numbers"
		Program ends.
		 */
		
		//while (first < 100 || second < 100) {
		//	System.out.println("Please enter 2 ints:");
		//	first = scan.nextInt();
		//	second = scan.nextInt();
		//}
		//
		
		do {
			System.out.println("Enter 2 numbers: ");
			int num1 =scan.nextInt();
			int num2 =scan.nextInt();
			sum = num1 + num2;
			
			
		} while (sum <= 100);
		
		System.out.println("Good numbers!");
		
		System.out.println("Please enter word:");
		String word = scan.next();
		String unique = "";
		for (int i= 0; i < word.length(); i++) {
			
		}
	}

}
