package day27;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		 int [] nums = {5, 7, 8, 9, 15, 19};
		System.out.println(Arrays.binarySearch(nums, 8));
		 
		int i = Arrays.binarySearch(nums, 9);
		System.out.println(i);
		
		 int [] nums2 = {14, 7, 8, 88, 15, 19};
		 //Arrays.sort(nums2);
		 System.out.println(Arrays.binarySearch(nums2, 88)); // -7 because not sorted
	}

}
