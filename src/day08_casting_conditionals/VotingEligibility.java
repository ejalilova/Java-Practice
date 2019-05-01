package day08_casting_conditionals;

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		//program to tell if you are eligible to vote
		//votingAge=18
		//yourAge=take from scanner
		//if you are eligible to vote:
		//you are eligible to vote
		//you have been eligible for 3 years
	    //else 
	    //you are not eligible to vote, you atill have 3 years to go
		
		Scanner keyboard = new Scanner(System.in);
		int votingAge = 18;
		System.out.println("How old are you?");
		
		int yourAge = keyboard.nextInt();
		
		if (yourAge>=votingAge) { //or 18 instead of voting age
			
			int years = yourAge-votingAge;
			
			System.out.println("Eligible to vote");
			System.out.println("you have been eligible to vote.");
		}else {
			System.out.println("you are not eligible to vote");
			System.out.println("you still have "+(votingAge-yourAge)+" more years to go");
			
		}
		
		
		
		
		
	}
	
	
	

}
