package TryingHomework;

import java.util.Arrays;

public class HW195 {
	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "Silent"));
	}

	public static boolean isAnagram(String word1, String word2) {

		char[] chars = word1.replaceAll(" ", "").toLowerCase().toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);

		char[] chars2 = word2.replaceAll(" ", "").toLowerCase().toCharArray();
		Arrays.sort(chars2);
		String sorted2 = new String(chars2);
		System.out.println(sorted);
		System.out.println(sorted2);
		return sorted.equalsIgnoreCase(sorted2);

	}
}