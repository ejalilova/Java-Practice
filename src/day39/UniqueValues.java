package day39;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class UniqueValues {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(10);
		nums.add(7);
		nums.add(8);
		nums.add(8);
		nums.add(3);
		nums.add(4);
		nums.add(8);
		List<Integer> unique = new ArrayList<>();
		for (Integer num : nums) {
			if (!unique.contains(num)) {
				unique.add(num);
			}
		}
		System.out.println(unique.toString());
		List<Integer> unique2 = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			int count = 0;
			Integer value = nums.get(i);
			for (int k = 0; k < nums.size(); k++) {
				if (nums.get(k) == value && i != k) {
					count++;
					break;
				}
			}
			if (count == 0) {
				unique2.add(value);
			}
		}
		System.out.println(unique2);
	}
}
