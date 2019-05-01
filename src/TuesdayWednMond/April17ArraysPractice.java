package TuesdayWednMond;

import java.util.Arrays;

public class April17ArraysPractice {
	public static void main(String[] args) {

		int[] nums = { 10, 15, 20, 25, 30 };
		System.out.println(Arrays.toString(nums));

		for (int num : nums) {
			// System.out.println(num);
			if (num > 17) {
				System.out.println(num);
			}
		}
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		System.out.println(sum);
		int middle = nums[nums.length/2];//int middle = nums[2];
		System.out.println(middle);
		int last = nums[nums.length-1];//nums[4];
		System.out.println(last);
		int[] nums2 = { 30, 20, 10, 15, 25 };
		int lowest = nums[0];//10
		for (int i =0; i < nums.length; i++) {
			if (nums2[i] < lowest) {
				lowest = nums2[i];
				
			}
			
		}
		System.out.println("Lowest: " + lowest);
		int max = nums[0];//30
		for (int i = 0; i < nums.length; i++) {
			if (nums2[i] > max) {
				max = nums2[i];
				
			}
					}
		System.out.println("Max: " + max);
	}
}