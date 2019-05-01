package day23Arrays;

public class FiveRawsOfLettersReverseOdd {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
			if (i % 2 == 0) {
			//outer loop
				//will repeat printing of letters as many times as we want
				// in this case we will print 3 times
				//so we are repeating inner loop 3 times
				
			
			//write a for loop that will print letters from a to z
			for(char letter = 'a'; letter <= 'z'; letter++) {
				System.out.print(letter);
				
			}
			} else {
				for(char letter = 'z'; letter >= 'a'; letter--) {
					System.out.print(letter);
			}
			System.out.println();
			System.out.println("***************************");
		}

		
			
	
		}
}

}
