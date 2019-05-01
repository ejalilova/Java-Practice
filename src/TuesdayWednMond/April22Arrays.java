package TuesdayWednMond;

public class April22Arrays {
	public static void main(String[] args) {
		// 1. array of int, check its in right order
		// 2. array we will check if a certain value is in the array
		// 3. one array and second array, we will check if everything in the first array
		// present in the second one
		int[] nums = new int[] { 1, 1, 4, 6, 7, 12 };
		int[] nums2 = new int[] { 1, 4, 6, 3, 7, 12 };
		int[] nums3 = new int[] { 1, 4, 8, 3, 7, 12 };
		isArraySorted(nums3);
		isArraySorted(nums2);
		isArraySorted(nums);
		isArraySorted(new int[] {10, 33});
	}
	public static void isArraySorted(int[] nums) {
		boolean sorted = true;
		for (int i = 0; i < nums.length - 1; i++) {
			System.out.println(nums[i] + " " + nums[i + 1]);
			if (nums[i] > nums[i + 1]) {
				sorted = false;
				break;// exit the loop
			}
		}
		System.out.println("Array is sorted or not? " + sorted);
	}
}
