package day34_methods06;
import java.util.*;

public class WarmUp {
	public static void main(String[] args) {
		int[] nums = { 5, 7, 9, 5, 5, 7, 6, 6, 6, 9, 5 };
		// 1. print
		System.out.println(findOccurences(nums, 5));
		System.out.println(findOccurences(nums, 6));
		// 2. assign return value into a variable
		int five = findOccurences(nums, 5);
		System.out.println("5 values " + five);

		if (five > 0) {
			System.out.println("We have 5s");
		} else {
			System.out.println("No 5s");
		}
		if (findOccurences(nums, 2) > 0) {
			System.out.println("We have 2");
		} else {
			System.out.println("No 2s");
		}
		// create array and pass to method
		int twenty = findOccurences(new int[] { 10, 20, 20, 30, 55, 22 }, 20);
		System.out.println(twenty);
		
		//getArray
	}

	public static int findOccurences(int[] array, int value) {
		int counter = 0;
		// for (int i = 0; i < array.length; i++) {
		// }
		for (int num : array) {
			if (num == value) {
				counter++;
			}
		}
		return counter;
	}
//method2: build array and assign values then return it//no parameters
	public static int[] getArray() {
		int[] retArray = {5, 19, 55, 63, 90};
		
		return retArray;
	}
}
