package day19loops;
import java.util.*;

public class GuessANumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random(); //used to generate random numbers
		
		//String word = scan.next();
		System.out.println("### WELCOME TO GUESS A NUMBER GAME ###"); //will give us number between 0 and 100
		
		int secretNumber = random.nextInt(101);
		int guessNumber;
		
		//int count = 1; // was not there before
		
		do {
			
			System.out.println("Guess a number: ");
			guessNumber = scan.nextInt();
			if (guessNumber < secretNumber) {
				System.out.println("Your number is to small");
			} else if (guessNumber > secretNumber) {
				System.out.println("Your number is too large");
				
			}
		} while (guessNumber != secretNumber);
			
		System.out.println("Bingo, congratulastions, you won!");
		
		//homework
		//put 5 maximum
		//new version
		
	}
	

}
