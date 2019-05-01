package TryingHomework;

import java.util.Arrays;

public class HW105ArraysPrint2 {
	public static void main(String[] args) {
		String[] words = { "hello", "why", "by", "apple", "note" };
		String sentence = "";
		for (int i = 0; i < words.length - 1; i++) {

			words[i] = words[i].substring(0, 1) + words[i].substring(words[i].length() - 1);
			

			// print → [ho, wy, by, ae, ne] 

		}
		
		System.out.print(Arrays.toString(words));
	}
}
