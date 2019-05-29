package day52_inheritance05;

public class FinalVariables {

	public final int ROADSTER_MAX_RANGE = 610;
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSANGERS;
	public final String JAN = "January";
	
	public static final String COMPANY_NAME = "Cybertek";
	public static final String ADMIN_USERNAME;
	
	static{
		ADMIN_USERNAME = "admin@gmail.com";
	}

	public FinalVariables() {
		MODEL_3_MAX_SPEED = 180;
	}
	/*
	 * we can do it this way also: public FinalVariables(int num) {
	 * MODEL_3_MAX_SPEED = num; }
	 */

	{
		MODEL_X_PASSANGERS = 7;
	}

	public static void main(String[] args) {
		final int MAX_PASSENGERS_COUNT = 5;

		final double PI = 3.14159;
		System.out.println(MAX_PASSENGERS_COUNT);

		final int SSN;
		SSN = 123456387;
		// SSN++; is not possible
		FinalVariables finalVar = new FinalVariables();
		System.out.println("Max range for roadster: " + finalVar.ROADSTER_MAX_RANGE);
		System.out.println("Model 3 max speed: " + finalVar.MODEL_3_MAX_SPEED);
		System.out.println("Model X passengers: " + finalVar.MODEL_X_PASSANGERS);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println("Company name: " + COMPANY_NAME);
		System.out.println("Company name: " + FinalVariables.COMPANY_NAME);
		System.out.println("Admin: " + ADMIN_USERNAME);
		
		
		
		
	}
}
