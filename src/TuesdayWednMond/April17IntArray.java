package TuesdayWednMond;

import java.util.Arrays;

public class April17IntArray {
	public static void main(String[] args) {
		int[] nums = { 30, 20, 10, 15, 25 };
		System.out.println(Arrays.toString(nums));
		for (int num : nums) {
			if (num > 17) {
				System.out.println(num);
			}
		}
//calculate sum using for loop
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

		}
		System.out.println("Sum: " + sum);
		
		//print middle number
		int m = nums[nums.length / 2];
		int l = nums[nums.length - 1];
		
		System.out.println(m+"|"+l);
		
		//find the lowest
		int lowest = nums[0];//30 assign first number, then compare in the loop
		for (int i = 0; i < nums.length; i++) {
		if (nums[i] < lowest) {
			lowest = nums[i];
		}
		}
		System.out.println("Lowest number: " + lowest);
		
	}
}