package day19loops;

public class PrintLetters {
	public static void main(String[] args) {
		/*print each character one by one in separate lines (charAt)
		 * 
		 */
		String word = "Amazon";
		int idx = 0;
				
		while (idx < word.length()) {
			System.out.print(word.charAt(idx));
			idx ++;
			
		}
		
		//print each character in the reverse order
		int idx2 = word.length()-1; //5
		
		while (idx2 >=0) {
			System.out.print(word.charAt(idx2));
			
			idx2 --;
		
			
			
			
	}

	}
}