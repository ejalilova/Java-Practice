package TryingHomework;

import java.util.ArrayList;
import java.util.Arrays;

public class HW188 {
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("sup", "howdy", "boop"));
		//String rr = removeAll.("yo");
		removeAll(wordList, "sup");
		System.out.print(wordList);
	}

	// create your method below
	public static void removeAll(ArrayList<String> wordList, String targetWord) {
		// removeAll(wordList,targetWord);
      for (int i = 0; i < wordList.size(); i++) {
        if (wordList.get(i).trim().equalsIgnoreCase(targetWord.trim())) {
          	//removeAll(wordList,targetWord);
        	//wordList.remove(targetWord);
        	wordList.remove(i);
        }
      }
      
	 }
		 
}
//languages.remove(0);