package day30Methods2;

public class EtsySearch {
public static void main(String[] args) {
	navigateToEtsy();
	searchForWoodenSpoon();
	printResults();
}
public static void navigateToEtsy() {
	System.out.println("Go to www.etsy.com");
}
public static void searchForWoodenSpoon() {
	System.out.println("Search for wooden spoon");
}
public static void printResults() {
	System.out.println("\"wooden spoon\" (14,720 Results)");
}
}
