package Day20Loops;

public class EvenOrOdd {
	public static void main(String[] args) {

		// using for loop 1-100
		// 1. print all even numbers

		for (int j = 1; j <= 100; j++) {

			if (j % 2 == 0) { // check if it is even
				System.out.println(j + " ");
			}
			
		}

		System.out.println();
		// 2.print all odd numbers in same line
		for (int j = 1; j <= 100; j++) {
			if (j % 2 != 0) {
				System.out.print(j + " ");
			}

		}
		System.out.println();
		// 3 3. sumOfOdds, sumOfEvents - calculate them and print out after the loop
		// sum of 1-10// 1+2+3+4 etc

		int sumOfOdds = 0;
		int sumOfEvens = 0;

		

		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				sumOfEvens = +num;
			} else {
				sumOfOdds += num;
			}

		}
		System.out.println("Sum of evens:" + sumOfEvens);
		System.out.println("Sum of odds:" + sumOfOdds);
	}
}
