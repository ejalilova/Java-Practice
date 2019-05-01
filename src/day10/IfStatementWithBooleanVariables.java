package day10;

public class IfStatementWithBooleanVariables {
	public static void main(String[] args) {
		boolean isBreakTime = true;
		if (isBreakTime == true) {
			System.out.println("Break till 8:35 PM");
		} else {

			System.out.println("Not Break time yet.");
		}

		// second version

		if (isBreakTime) {
			System.out.println("Break till 8:35 PM");
		} else {

			System.out.println("Not Break time yet.");
		}

		boolean classTime = true;

		if (classTime) { // or if(classTime==true){
			System.out.println("Come back on time");
			System.out.println("Stop talking");
			System.out.println("pay attention");
			System.out.println("Code and have fun!");
		} else {

			System.out.println("Take a walk and have some water");

			boolean qualified = false;// if true, do not do anything
			// if not qualified send a notification message
			if (qualified == false) { // or != is not true
				System.out.println("Your application was not approved. Thank you");

			}

		}

	}

}
