package day23Arrays;

public class PrintNumbersWithLoops3 {
	public static void main(String[] args) {
		for (int j = 10; j >= 1; j--) {
			for (int i = j; i >= 1; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}

