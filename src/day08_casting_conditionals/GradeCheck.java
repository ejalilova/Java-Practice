package day08_casting_conditionals;

import java.util.Scanner;
		//pseudocode

public class GradeCheck {
	
	public static void main(String[] args) {
		//A, B, C, D
		//char grade = scann.next().charAt(0);
		// if 'A' => Excellent job! Keep it up!
		//else how many point did you miss for 'A'?
		//int points = scanner
		//print "Your grade B is not good enough." "You could earn 10 more points if you studied harder."
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your grade?");
		char grade = keyboard.next().charAt(0);
		
		if (grade == 'A') {
			System.out.println("Excellent job! Keep it up!");
		}else {
			System.out.println("Your grade B is not good enough.");
			System.out.println("How many points did you miss for A?");
		int points = keyboard.nextInt();
			System.out.println("You could earn "+points+" more points if you studied harder.");
			
		}
	

		
	}

}
