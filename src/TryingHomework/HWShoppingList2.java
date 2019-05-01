package TryingHomework;

import java.util.Scanner;

public class HWShoppingList2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalProce = 0;

		System.out.println("Enter Item" + count + " and its price:");
		item = scan.next();
		price = scan.nextDouble();

		for (int i = 0; i <= 2; i++) {
			System.out.println("Add one more item?");
			countinue = scan.next();
			if (countinue.equals("yes")) {
				count++;
				System.out.println("Enter Item" + count + "and its price:");
				item = scan.next();
				price = scan.nextDouble();
				totalProce = totalProce + price;

			} else {
				System.out.println("Item" + count + ": " + item + " Price: " + price + ", ");

				System.out.println("Total price: " + price);
			}
		}
	}
}
//output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
//output: Total price: 15.3
