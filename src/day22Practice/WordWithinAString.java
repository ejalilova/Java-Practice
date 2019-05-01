package day22Practice;

public class WordWithinAString {
	public static void main(String[] args) {
	
	//String sentence = "I am learning java programming. java is fun. Love java!";
	
	//look for "java" in the sentence and print the count
	
	String sentence = "He said hi, then she replied hi. hi guys!";
	
	//print letters in pairs
	//He
	//e
	// s
	//ai
	
	//int n = 0;
	//int length = sentence.length();
	
	//System.out.println(length);
	//check if temp = "hi" if true, increase add 1 to count
	int count = 0;
	for (int n = 0; n < sentence.length()-1; n++) {
		String temp = sentence.substring(n, n+2);
		System.out.println(temp);
		//if (temp.contains("hi")) {
		if (temp.equals("hi")) {
			count++;
		}
	
	}
	System.out.println("Count: " + count);
	//print count: 3
	}

}
