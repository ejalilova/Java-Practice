package TryingHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party83 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String all = "";
		
		List<String> guest = new ArrayList<String>();
		//guest.add("Jenya");
		
		String name;

		String answer;

		do {
			System.out.println("Please enter guest name: ");
			guest.add(input.next());

			System.out.println("Do you want to enter new guest name:");
			
			answer = input.next();

		} while (answer.equalsIgnoreCase("yes"));
		System.out.println("Guest's list: " + String.join(", ", guest));
	}
}
