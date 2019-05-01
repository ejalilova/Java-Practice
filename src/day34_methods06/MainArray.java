package day34_methods06;

import java.util.*;

public class MainArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(WarmUp.getArray()));
		// store return value into array
		int[] nums = WarmUp.getArray();
		System.out.println(Arrays.toString(nums));
		for (int num : nums) {
			System.out.print(num + ",");
			System.out.println(Arrays.toString(getRandomArray(10)));
			int[] randomNums = getRandomArray(3);
			System.out.println(Arrays.toString(randomNums));
		}
	}

	public static int[] getRandomArray(int size) {
		// in the method create an array with value of size and assign random values
		// from 1-100 & return it
		Random rand = new Random();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = rand.nextInt(101);
		}
		return nums;
	}
}
