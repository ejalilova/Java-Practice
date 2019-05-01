package TryingHomework;

import java.util.Scanner;

public class HW114ArraysFindNonDuplicate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };
		int count = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			for (int k = 0; k <= nums.length - 1; k++) {
				if (nums[i] == nums[k]) {
					count++;
				}

			}
			if (count == 1) {
				System.out.println(nums[i]);
				return;
			}
			count = 0;
		}
	}
}
