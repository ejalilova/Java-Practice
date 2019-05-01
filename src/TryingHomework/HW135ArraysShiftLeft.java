package TryingHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HW135ArraysShiftLeft {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		// WRITE YOUR CODE HERE
		if (nums.length < 1) {
			System.out.println(Arrays.toString(nums));
		}
		int first = nums[0];

		for (int i = 1; i < nums.length; i++) {
			nums[i - 1] = nums[i];

		}
		nums[nums.length - 1] = first;
		System.out.println(Arrays.toString(nums));
	}
}
