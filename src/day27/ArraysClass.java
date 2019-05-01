package day27;
import java.util.*;
public class ArraysClass {
	public static void main(String[] args) {
		int [] nums = {43, 12, 4, 1, 3, 5};
		
		//to string method
		Arrays.toString(nums);
		System.out.println(Arrays.toString(nums));
		String str = Arrays.toString(nums);
		System.out.println(str);
		
		//sort method
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));//sorted numbers
		
		String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic", "Uzbeck"};
		System.out.println(Arrays.toString(languages));
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		//find lowest and largest values from nums2 array
		int [] nums2 = {15, 200, 333, 55, 11, 45};
		System.out.println(Arrays.toString(nums2));
		Arrays.sort(nums2);
		int lowest = nums2[0];
		int largest = nums2[nums2.length-1];
		
		System.out.println("Lowest: " + lowest);
		System.out.println("Largest " + largest);
	}

}
