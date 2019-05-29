package day40custommethods;
import java.util.*;
public class WarmUpList {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Moon");
		myList.add("Sun");
		myList.add("Mars");
		myList.add("Saturn");
		myList.add("Venus");
		myList.add("Sun");
		myList.add("Earth");
		myList.add("Pluto");
		myList.add("Sun");
		myList.add("Mercury");
		myList.add("Neptune");
		String targetWord = "Sun";
		
		int count = countOccurances(myList, targetWord);
		if (count == 3) {
			System.out.println("Unit test Pass: Count is 3");
		} else {
			System.out.println("Unit test FAIL: Count is " + count);
			System.out.println("Expected: 3");
			System.out.println("Actual: " + count);
		}
	}
public static int countOccurances (ArrayList<String> list, String word) {
	int count = 0;
	for (String str : list) {
		if (str.equals(word)) {
			count++;
		}
	}
	return count;
}
}
