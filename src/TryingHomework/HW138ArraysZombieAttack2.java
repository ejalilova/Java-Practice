package TryingHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HW138ArraysZombieAttack2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}
		// TODO. Write you code below this line.
		int sum;
		int dayCount = 0;
		//System.out.println("Day " + (dayCount++) + " " + Arrays.toString(inhabitants));
		boolean[] check = new boolean[inhabitants.length + 2];
		do {
			sum = 0;
			for (int i = 0; i < inhabitants.length; i++) {
				if (inhabitants[i] == 0) {
					check[i] = true;
					check[i + 2] = true;
				}
			}
			for (int j = 1; j < check.length - 1; j++) {
				if (check[j]) {
					inhabitants[j - 1] /= 2;
				}
				sum += inhabitants[j - 1];
			}
			System.out.println("Day " + (dayCount++) + " " + Arrays.toString(inhabitants));
		} while (sum != 0);
		System.out.println("---EXTINCT---");

	}
}