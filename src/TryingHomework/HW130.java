package TryingHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HW130 {
	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		float[] score = { 5, 7, 9, 2, 8, 4, 5 };
		// WRITE YOUR CODE HERE
		float[] newScore = new float[5];
		Arrays.sort(score);
		int sum = 0;
		// float sc = Integer.parseInt(score);
		for (int i = 1; i < score[6]; i++) {
			sum = sum + score[i];
			//System.out.println(Arrays.toString(newScore));
			
		}
for (int s = 0; s < newScore.length; s++) {
	int sum += newScore[s];
}
		// FINAL OUTPUT
		// System.out.printf("Total: %.2f", total);

	}
}