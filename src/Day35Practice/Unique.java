package Day35Practice;

import java.util.Arrays;

public class Unique {
	public static void main(String[] args) {
		int[] num = { 7, 4, 1, 4, 1, 5, 9, 9, 3 };
		System.out.println(Arrays.toString(num));

		findUnique(num);
		int[] arr = { 2, 5, 7, 8, 8, 5 };
		findUnique(arr);

	}

	private static void findUnique(int[] num) {
		for (int i = 0; i < num.length; i++) {
			int temp = num[i];
			int count = 0;
			for (int j = 0; j < num.length; j++) {
				if (temp == num[j] && i != j) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.print(temp + " ");

			}
		}
	}
}
