package TryingHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HW130 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float[] score = new float[7];
		// WRITE YOUR CODE HERE
		 for (int i = 0; i < score.length; i++) {
				System.out.println("Enter score for judge " + (i + 1) + ":");
				score[i] = input.nextFloat();

			}
			float sum = 0;
			System.out.println("Enter difficulty: ");
			float difficulty = input.nextFloat();
		    
		    
			Arrays.sort(score);
			for (int i = 1; i < score.length - 1; i++) {
				sum = sum + score[i];
			}
			sum = sum * difficulty;
			double total = sum / 0.6;
	    
	    // FINAL OUTPUT
	    System.out.printf("Total: %.2f", total);
	  }
	}