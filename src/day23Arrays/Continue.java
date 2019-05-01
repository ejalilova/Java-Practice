package day23Arrays;

public class Continue {
	public static void main(String[] args) {
		/*
		 * for (int i = 1; i <= 100; i++) { 
		 * if (i == 5) { 
		 * continue; 
		 * }
		 * System.out.println("Number " + i); } }
		 * }
		 */
		
// print 1 to 20, skip numbers that are range from 5 to 10
		
		for (int i = 1; i <= 20; i++) {
			if (i >= 5 && i <= 10)
			continue;
			System.out.println(i);
			
		}
		
	}

}

