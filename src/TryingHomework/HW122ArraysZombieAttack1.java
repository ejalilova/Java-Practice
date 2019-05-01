package TryingHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HW122ArraysZombieAttack1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		// TODO. Write you code below this line.
		int[] arr = new int[inhabitants.length];
		for (int i = 0; i < inhabitants.length - 1; i++) {
			System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
			if (Arrays.equals(inhabitants, arr)) {
				System.out.print("---- EXTINCT ----");
				break;
			} else {
				for (int j = 0; j <= inhabitants.length - 1; j++) {

					inhabitants[j] = inhabitants[j] / 2;
				}
			}

		}

	}
}
