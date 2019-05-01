package day24Arrays;

import java.util.Arrays;

public class SumOfTheNumbers {
	public static void main(String[] args) {
		// create an array of integers with length 3
		int[] numbers = new int[3];
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 20;
		// System.out.println(numbers[0]);
		System.out.println(Arrays.toString(numbers));
		// use for loop to look through the array
		// & calculate sum of all elements
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum: " + sum);
		// find largest value in the array
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Max value: " + max);
		// find min value in the array
		int min = 0;
		for (int k = 0; k < numbers.length; k++) {
		if (numbers[k] < min) {
			min = numbers[k];
			
		}
		}
		System.out.println("Min value: " + min);
	}
}