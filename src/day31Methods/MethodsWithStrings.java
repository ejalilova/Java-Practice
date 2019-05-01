package day31Methods;

import java.util.Arrays;

public class MethodsWithStrings {
	public static void main(String[] args) {
		/*name: countWords
		 * return: void
		 * programs/args: String sentence
		 * count words ("Java is fun");
		 * "Words in this sentence [Java, is fun]";
		 * "Number of words: 3"
		 * 
		 * 		 */
		countWords("Java is fun");
		countWords("This is method with strings");
		googleSearchResults("About 121,000,000 results (0.75 seconds)");
		
	}
	public static void countWords(String sentence) {
		String[] words = sentence.split(" ");
		System.out.println("Words  in this sentence: " + Arrays.toString(words));
		System.out.println("Length is: " + words.length);
	}
	public static void googleSearchResults(String result) {
	//String first[] = result.split(" ");
	//for(int i = 0; i < first.length; i++) {
	String[] words = result.split(" ");
	String count = words[1].replace(",", "");
	String seconds = words[3].replace("(", "");
	System.out.println("Results count: " + count);
	System.out.println("Time count: " + seconds);
	
	//System.out.println("Results count:" + first[1]);
//System.out.println("Time in seconds" + first[3]);

}
}

