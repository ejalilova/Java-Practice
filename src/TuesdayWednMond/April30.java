package TuesdayWednMond;

import java.util.*;

public class April30 {
	public static void main(String[] args) {
		int[] nums1 = { 10, 20, 5, 3 };
		int[] nums2 = { 5, 1, 1, 4 };
		//int[] nums3 = new int[nums1.length];
		 System.out.println(nums1[0] + nums2[0]);
		//for (int i = 0; i < nums1.length; i++) {
		//	nums3[i] = nums1[i] + nums2[i];

		//}
		int[] newArray = add2Arrays(nums1, nums2);
		System.out.println("nums1: " + Arrays.toString(nums1));
		System.out.println("nums2: " + Arrays.toString(nums2));
		System.out.println("nums3: " + Arrays.toString(newArray));
		String[] str1 = {"cybertek", "java", "Student", "mentor"};
		String[] str2 = {"100", "001", "five", "best"};
		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(str2));
		//System.out.println("New one: " + Arrays.toString(newOne));
		String[] third = add2Arrays(first, second);
	}

	public static int[] add2Arrays(int[] nums1, int[] nums2) {
		int[] nums3 = new int[nums1.length];
		// System.out.println(nums1[0] + nums2[0]);
		for (int i = 0; i < nums1.length; i++) {
			nums3[i] = nums1[i] + nums2[i];

		}

		return nums3;
	}
	public static String[] add2Arrays(String[] str1, String[] str2) {
		String[] newOne = new String[str1.length];
		for (int i = 0; i < str1.length; i++) {
			newOne[i] = str1[i] + "-" + str2[i];
		}
		return newOne;
	}
}
//"abc", "hi"]
//["bye", "sql"]
//["abc-bye", "hi-sql"]
