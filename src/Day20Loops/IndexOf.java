package Day20Loops;

public class IndexOf {
	public static void main(String[] args) {
		
		String word = "Amazon";
		
		char letter = 'a';
		
		int index = -1;
		
		for(int i = 0; i < word.length(); i++)  {
			if (word.charAt(i) == letter) {
				index =i;
				break;
			}
		}
		System.out.println("Index: " + index);
		//System.out.println(word.indexOf("letter"));
		//using for loop - look for the letter 
		//if it is a match assign value to index
		//exit for loop
		//print value of index
		
		/*for (int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i));
		 * 
		 * 
		 */
		
	}
}
