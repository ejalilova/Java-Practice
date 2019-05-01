package day25arrays03;

public class Shopping {
	public static void main(String[] args) {
		String[] products = { "Timberland", "H&M Shirt", "Swatch Watch", "Gucci Bag", "Adidas socks" };
		double[] prices = { 120.0, 5.99, 150.5, 3000, 6.99 };
		int[] itemsId = { 12345, 12346, 12347, 12348, 12349 };
		// print count of products
		// loop through products and print each one in separate line
		System.out.println("Products count: " + products.length);
		// check if products, prices and itemsId have same count

		// for (int i = 0; i > product.length)
		// System.out.println(products[]);
		if (products.length == prices.length && products.length == itemsId.length) {
			System.out.println("Shopping list looks good");

		} else {
			System.out.println("Something is wrong in this list");
			return;
		}
		// loop through products and print each one in separate line

		for (String p : products) { // fixed length
			System.out.println(p);
		}
		// prices - for loop
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		//print last item ID:
		System.out.println(itemsId[itemsId.length - 1]);
		// itemsID print reverse
		System.out.println("======= REVERSE=========");
		for (int idx = itemsId.length - 1; idx >= 0; idx--) {
			System.out.println(itemsId[idx]);
		}
			// print a report with a total price
			// Item 1: 12345 - Timberland Shoes - $120.0
			double totalPrice = 0.0;
			
			System.out.println("############### YOUR SHOPPING RECEIPT ################");
			for (int i = 0; i < products.length; i++) {
				System.out.println("Item " + (i + 1) + ": " + itemsId[i] + " - " + products[i] + " - $" + prices[i]);
				totalPrice += prices[i];
			}
			System.out.println("Total Price: $" + totalPrice);
			//find the most expensive item in your list and print it as a report
			int maxIndex = 0;
			double maxPrice = 0;
			for (int i = 0; i < prices.length; i++) {
				if (prices[i] > maxPrice) {
					maxPrice = prices[i];
					maxIndex = i;
				}

			}
			//{ 120.0, 5.99, 150.5, 3000, 6.99 };
			System.out.println(itemsId[maxIndex] + " - " + products[maxIndex] + " - $" + maxPrice);
			int minIndex = 0;
			double minPrice = prices[0];
			 
			for (int i = 0; i < prices.length; i++) {
				if (prices[i] < minPrice) {
					minPrice = prices[i];
					minIndex = i;
				}

			}
			System.out.println(itemsId[minIndex] + " - " + products[minIndex] + " - $" + minPrice);
		}

	}


