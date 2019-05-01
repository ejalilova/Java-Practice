package ThursdayPractice;

import java.util.Scanner;

public class IfStatementsTernary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month number");
		int month = scan.nextInt();

		
		
		// if (month >= 1 && month <= 2 || month == 12) {
		// System.out.println("winter");
		// } else if (month >= 3 && month <= 5) {
		// System.out.println("spring");
		// } else if (month >= 6 && month <= 8) {
		// System.out.println("summer");
		// } else if (month >= 9 && month <= 11) {
		// System.out.println("fall");
		// } else {
		// System.out.println("invalid value");
		// }
		String message = "";
		switch (month) {

		case 1:
		case 2:
		case 3:
			System.out.println("winter");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("spring");
			break;
		default:
			message = "Invalid number!";

		}
		System.out.println(message);
	}
}
