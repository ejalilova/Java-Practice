package day36WrappersArrayIntro;

import java.util.ArrayList;

public class ArrayListIntroduction {
	public static void main(String[] args) {
		//Create an arraylist
		String[] namesArr = new String[5];
		ArrayList<String> names = new ArrayList<>();
		
		int[] numsArray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();
		
		//assign values into arrayList
		names.add("Roman");
		names.add("Orhan");
		names.add("Nataliya");
		
		nums.add(100);
		nums.add(7);
		nums.add(15);
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		System.out.println(nums.get(2));
		
		System.out.println("Names count: " + names.size());
		System.out.println("Nums count: " + nums.size());
		
	}
}
