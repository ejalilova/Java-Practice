package day38ArrayList03;

import java.util.ArrayList;

public class ContainsMethod {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");

		System.out.println(list1.toString());
		ArrayList<String> list2 = list1;// list1, list 2 point to the same object
		ArrayList<String> months = new ArrayList<>(list1);
		System.out.println(months.toString());
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		// [Jan, Feb, Mar, Apr, May]
		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		System.out.println(months.contains("Jun"));
		// how would you check if Feb is in second position
		System.out.println(months.indexOf("Feb") == 1);
		System.out.println(months.get(1).equals("Feb"));

		ArrayList<String> month2 = new ArrayList<>(list1);
		System.out.println("Month: " + months.toString());
		System.out.println("Month: " + month2.toString());
		// check if month has all the values of month2
		if (months.containsAll(month2)) {
			System.out.println("All months");
		} else {
			System.out.println("Not all months");
		}
//add one more Jan to month2
		month2.add("Jan");
		if (months.containsAll(month2)) {
			System.out.println("All months");
		} else {
			System.out.println("Not all months");
		}
	}
}
