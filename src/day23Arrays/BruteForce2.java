package day23Arrays;

import java.util.Scanner;

public class BruteForce2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/* loop through the numbers from 1 till 50 print each number in the same line if
		 * number is divisible by 5 (n%5==0), skip it if number is divisible by 20, then
		 * exit the loop
		 */
		
		
		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0) {
				continue;
			}
			if (i % 21 == 0) {
				break;
			}
			System.out.print(i + ",");
		}
		
	}
	

}

