package TryingHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HW147Methods9isPos {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {
			arr[i] = inp.nextInt();
		}
		// #2 Your code here
		//System.out.println(Arrays.toString(arr));
		for (int x : arr) {
			isPos(x);
		}
		
	}

	public static void isPos(int nums) {
		// #1 your code here

		if (nums <= 0) {
			System.out.println("not positive");

		} else if (nums > 0) {
			System.out.println("positive");

		}
	}
}
