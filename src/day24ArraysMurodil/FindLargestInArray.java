package day24ArraysMurodil;

import java.util.Scanner;

public class FindLargestInArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many items in Array?");
		int count = input.nextInt();
		
		int[] nums = new int[count];
		
		for (int i = 0; i < count; i++) {
			System.out.println("Enter number " + (i+1));
			nums[i] = input.nextInt();
			
		}
		for (int n : nums) {
			System.out.println(n + " ");
		}
		System.out.println();
	}

}
