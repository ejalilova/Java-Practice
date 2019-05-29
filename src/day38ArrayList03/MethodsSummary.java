package day38ArrayList03;

import java.util.ArrayList;
import java.util.List;

public class MethodsSummary {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("grey");
		list.add("black");
		list.add(0, "yellow");
		System.out.println(list.toString());
		System.out.println("Size: " + list.size());
		System.out.println("Get index: " + list.get(2));
		System.out.println("Removes black: " + list.remove(5));
		System.out.println(list.toString());
		list.remove("grey");
		System.out.println(list.toString());
		list.set(1, "orange");
		System.out.println(list.toString());
		System.out.println("Index of blue: " + list.indexOf("blue"));
		System.out.println("Is list empty? " + list.isEmpty());
		System.out.println("Is list empty? " + (list.size() == 0));
		System.out.println("White in the list? " + list.contains("white"));

		List<String> list2 = new ArrayList<>();
		list2.addAll(list);
		System.out.println(list2);
		System.out.println(list.containsAll(list2));
		System.out.println(list.equals(list2));
		list2.add("pink");
		list2.removeAll(list);
		System.out.println(list2);

		list2.addAll(0, list);
		System.out.println("list2 after list2.addAll(0, list): " + list2);

		list.clear();
		list2.clear();
		System.out.println(list.isEmpty() && list2.isEmpty());
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               