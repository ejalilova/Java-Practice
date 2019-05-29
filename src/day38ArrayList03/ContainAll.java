package day38ArrayList03;
import java.util.*;
public class ContainAll {
	public static void main(String[] args) {
		List<Integer> nums1 = new ArrayList<>();
		nums1.add(10); nums1.add(20); nums1.add(30); nums1.add(40);
		
		List<Integer> nums2 = new ArrayList<>();
		nums2.add(20); nums2.add(10); nums2.add(40); nums2.add(30);
		//test if nums 1 has all nums2 values
		
		if (nums2.containsAll(nums2)) {
			System.out.println("Num1 containsAll nums2 the same numbers");
		} else {
			System.out.println("Nums1 does not containAll nums2");
		}
		System.out.println(nums2.containsAll(nums1));
		boolean b = nums1.containsAll(nums2) && nums2.containsAll(nums1);
		
		List<String> planA = new ArrayList<>();
		planA.add("java");
		planA.add("replit");
		planA.add("pingpong");
		planA.add("food");
		planA.add("run");
		planA.add("sleep");
		List<String> planB = new ArrayList<>();
		planB.add("food");
		planB.add("run");
		planB.add("sleepy");
		planB.add("java");
		planB.add("pingpong");
		planB.add("replit");
		//check if both have same values ignoring order
		if (planB.containsAll(planA) && planA.containsAll(planB)) {
			System.out.println("Plans A and B match");
		} else {
			System.out.println("Plans A and B do not match");
		}
	}

}
