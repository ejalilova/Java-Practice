package TryingHomework;

import java.util.ArrayList;

public class HW187 {

	
	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
		ArrayList<String> hWork = new ArrayList<>();
		wordList1.addAll(wordList2);
		return wordList1;
	}

}