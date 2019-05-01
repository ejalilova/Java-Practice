package TryingHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HW118ArraysReverseArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };

		// TODO: write your code below

		
	for (int idx = 0, x = nums.length -1; idx < nums.length/2; idx++, x--) {
			int temp = nums[idx];
			nums[idx] = nums[x];
			nums[x] = temp;
			
		}
		
		// Do not change below statement:
		System.out.println(Arrays.toString(nums));

	}

}
//for(int i = 0; i < nums.length/2; i ++) {
//int temp = nums[i];//0
//nums[i] = nums[nums.length -i -1];
//nums[nums.length -i - 1] = temp;

//}
