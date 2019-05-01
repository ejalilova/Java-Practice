package day32Methods;

import java.util.Arrays;

public class ArrayParameters {
	public static void main(String[] args) {
		int[] myArray = { 44, 22, 66, 11 };
		printArray(myArray);
		printArray(new int[] { 33, 45, 5, 7 });
		printArray(new int[] { 3, 4, 5, 6, 7, 3, 42, 6 });
		int[] one = { 10, 2, 3 };
		int[] two = { 3, 1 };
		print2Arrays(one, two);
		print2ArraysV2(one, two);
	}

	/*
	 * Method: printArray return type: void param: int[] nums print values of the
	 * nums array
	 */
	public static void printArray(int[] nums) {
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	/*
	 * print2Arrays/return void/param 2 int[]/prints larger array followed by
	 * smaller array
	 */
	public static void print2Arrays(int[] arrNums1, int[] arrNums2) {
		if (arrNums1.length > arrNums2.length) {
			System.out.println(Arrays.toString(arrNums1));
			System.out.println(Arrays.toString(arrNums2));

		} else {
			System.out.println(Arrays.toString(arrNums2));
			System.out.println(Arrays.toString(arrNums1));
		}
	}
	//version2.we will call printArray method
	public static void print2ArraysV2(int[] arrNums1, int[] arrNums2) {
		if (arrNums1.length > arrNums2.length) {
			printArray(arrNums1);
			printArray(arrNums2);

		} else {
			printArray(arrNums2);
			printArray(arrNums1);
		}
	}
}
