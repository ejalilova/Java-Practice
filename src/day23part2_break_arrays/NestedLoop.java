package day23part2_break_arrays;

public class NestedLoop {
	public static void main(String[] args) {

		for (int j = 0; j <= 5; j++) {
			for (int i = 0; i <= 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println(); // puts to new raw

		}
		System.out.println("Outside the loop");
		
		
		for (int j = 0; j <= 5; j++) {///////
			for (int i = 0; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println(); // puts to new raw

		}
		System.out.println("Outside the loop");
		
		for (int k = 10; k >= 1; k--) {
			for (int m = 1; m <= k; m++) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}
}


