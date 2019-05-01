package ThursdayPractice;

import java.util.Arrays;

public class ArraysNumbers {
	public static void main(String[] args) {
		int[] nums = { 123, 532, 34, 643 };
		System.out.println(nums[1]);
		nums[1] = 5;
		System.out.println(Arrays.toString(nums));
		long max = nums[0];
		long min = nums[0];
		int counter = 0;
		for (int num : nums) {
			System.out.println("Checking " + counter + " value from array...");
			System.out.println("Is " + num + " is greater than current max " + max + " or not?");
			if (num > max) {
				max = num;
			}
			System.out.println("Is " + num + " is greater than current max " + min + " or not?");
			if(num<min) {
				min = num;
			}
			System.out.println();
			counter++;
		}
		System.out.println("Maximum: " + max);
		
	}
}
