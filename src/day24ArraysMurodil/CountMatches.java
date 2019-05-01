package day24ArraysMurodil;

public class CountMatches {
	public static void main(String[] args) {
		
double[] prices = {12.55, 4.30, 6.20, 7.05, 
			2, 8.20, 75.04, 3.60, 5.10, 1.65};
	int count = 0;
	for (double price : prices) {
		if (price > 20.0) {
			count++;
			
		}
	}
	if (count == 0) {
		System.out.println("No items for more than $20");
	}
	System.out.println(count + " items with more than $20");
	}
}
