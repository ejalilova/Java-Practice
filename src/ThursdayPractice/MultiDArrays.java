package ThursdayPractice;

import java.util.Arrays;

public class MultiDArrays {
	public static void main(String[] args) {

		int[][] nums = { { 123, 532, 34, 643, -345, 73, 436, 344362, 547 },
				{ 12123, 657, 34, 56643, -567, 73, 345, 4563657, 35673576 },
				{ 22342, 343, 3453245, 34534, -567, 73, 345, 4563657, } };
		int max = nums[0][0];
		int min = nums[0][0];
		int countPositive =0;
		int countNegative = 0;
		int total = 0;
		for (int rows = 0; rows < nums.length; rows++) {
			// inner loop
			// changing column
			// nums [rows].length means length of specific array
			// if rows = 0; then it's gonna be length of 1st array
			// System.out.println(Arrays.toString(nums[rows]));
			for (int columns = 0; columns < nums[rows].length; columns++) {
				// System.out.println(nums[rows][columns] + " | ");
				if (nums[rows][columns] > max) {
					max = nums[rows][columns];

				}
				if (nums[rows][columns] < min) {
					min = nums[rows][columns];
					
				}
				if (nums[rows][columns] > 0) {
					countPositive++;
				} else if (
						nums[rows][columns] < 0) {
					countNegative++;
				}
				//to find total
				total += nums[rows][columns];
			}
			System.out.println();
		}
		System.out.println("Minimum: " + min);
		System.out.println("Maximun: " + max);
		System.out.println("Count positive: " + countPositive);
		System.out.println("Count negative: " + countNegative);
		System.out.println("Total: " + total);
		
	}
}
