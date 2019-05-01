package TryingHomework;

public class HW113PrintEvenFrom80to20 {
	public static void main(String[] args) {
		/*
		 * Write a for loop that prints all the even integers from 80 through 20
		 * inclusive, separated by spaces.
		 * 
		 */

		for (int c = 80; c >= 20; c--) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}

		}
	}

}
