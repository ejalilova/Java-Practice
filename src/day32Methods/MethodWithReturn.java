package day32Methods;

public class MethodWithReturn {
	public static void main(String[] args) {
		System.out.println( giveMe10$() );
		int i = giveMe10$();
		System.out.println("i: " + i);
		System.out.println(giveMeYourName());
	}
	public static int giveMe10$() {
		System.out.println("returning 10 from method");
		/*
		 * this method returns int value
		 */
		return 10;
	}
/*
 * giveMeYourName/return type String/declare name variable assign name
 * return it/ call in main method
 */
	public static String giveMeYourName() {
		String name = "Enya";
		return name;
	}
}










