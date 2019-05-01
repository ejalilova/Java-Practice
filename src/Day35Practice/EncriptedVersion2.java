package Day35Practice;

public class EncriptedVersion2 {
	public static void main(String[] args) {
		System.out.println(encryptChar('z'));
		String normal = "sunday";
		String encrypted = encryptWord(normal);
		System.out.println("normal: " + normal + "\n" + "encrypted: " + encrypted);
		System.out.println(encryptSentence("java is fun"));
		/*
		 * encryptChar
		 * return type: char
		 * param: char
		 * takes a char & returns encrypted version
		 * encryptChar('a') ==> z
		 */
	/*
	 * encryptWord
	 * return type: String
	 * param: String
	 * take a string and returns encrypted version for the whole word
	 */
		
	}
	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";
		return encrypted.charAt(alphabet.indexOf(ch));
			}
	public static String encryptWord(String word) {
		 String cypered = "";
		 for (int i = 0; i < word.length(); i++) {
			 cypered += encryptChar(word.charAt(i));
			 
		 }
		 return cypered;
	}
	/*
	 * encryptSentence//lower cases
	 * return: String
	 * param: String Sentence
	 * Split the sentence by space and call encryptWord and return encrypted sentence
	 */
	public static String encryptSentence(String sentence) {
		String[] wordsArr = sentence.split(" ");
		String retValue ="";
		for (String word : wordsArr) {
			retValue += encryptWord(word) + " ";
			
		}
		return retValue.trim();
	
	}
}
