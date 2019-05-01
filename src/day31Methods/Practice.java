package day31Methods;

public class Practice {
	public static void main(String[] args) {
		String word = "However";

		//print each character in the reverse order
		int idx2 = word.length()-1; //5
		
		while (idx2 >=0) {
			System.out.print(word.charAt(idx2));
			
			idx2 --;
		
		}
	}
}


/*
 * int idx = word.length()-1;
		
		while(idx >= 0) {
		reversed = (reversed + word.charAt(idx));
		idx --;
		
		}
		System.out.println(reversed);
*/
