package TuesdayWednMond;

import java.util.Arrays;

public class April29Array {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 1, 4, 1, 6 };
		int target = 1; // need to remove all 1s from nums
		System.out.println(Arrays.toString(removeFromArray(nums, target)));
		int[] nums2 = removeFromArray(new int[] {3, 3, 5, 5, 6, 1, 3}, 3);
		System.out.println(Arrays.toString(nums2));
	}

	public static int[] removeFromArray(int[] nums, int target) {
		int counter = 0;
		for (int n : nums) {
			if (n == target) {
				counter++;
			}
		}
		int[] newArray = new int[nums.length - counter];
		int idx = 0;
		for (int n : nums) {
			if (n != target) {
				newArray[idx] = n;
				idx++;
			}
		}
		return newArray;
	}
}
