package day24Arrays;

public class SplitSentence {
	public static void main(String[] args) {
		
		String sentence = "Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.";
		
		String[] words = sentence.split(" ");
		int counter = 0;
		for (String str : words) {
		System.out.println(str);
		
		if (str.equals("language")) {
			break;
		}
		counter ++;
	}
		//System.out.println(words[0]);
		//find position of word "language"
		System.out.println("Position: " + counter);
		System.out.println(words[counter]);
	}
}


