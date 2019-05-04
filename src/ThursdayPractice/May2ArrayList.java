package ThursdayPractice;

import java.util.ArrayList;

public class May2ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(23);
		nums2.add(100);
		nums2.add(125);
		nums2.add(65);
		nums2.add(600);
		nums2.add(2, 65);
		System.out.println(nums2);
		System.out.println("How many elements in array list? " + nums2.size());
		Integer numToDelete = 600;
		nums2.remove(numToDelete);
		System.out.println(nums2);

	}
}
