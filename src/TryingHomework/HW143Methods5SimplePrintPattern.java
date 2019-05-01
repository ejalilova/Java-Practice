package TryingHomework;

public class HW143Methods5SimplePrintPattern {

	// class Main {

	public static void printHollowRect() {
		
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				if(row == 1 || row == column || row == 1 || row == column) {
				System.out.println("*");
				}else {
					System.out.println(" ");
				}
					
			}
		}

	}

	public static void main(String[] args) {

		printHollowRect();
	}

}
