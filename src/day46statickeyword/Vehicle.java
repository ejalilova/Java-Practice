package day46statickeyword;

public class Vehicle {
	String type; // instance variable, every object has its own type
	static int numberOfVehicles;// shared, one central value

	public static void vehicleInfo() {
		// System.out.println("type: " + type);//will not compile/type is non static
		System.out.println("numer of vehicles: " + numberOfVehicles);
		int count = getNumberOfVehicles();
		String make = "Kia";
		make = make.toLowerCase();
		System.out.println("make: " + make);
	}

	public static int getNumberOfVehicles() {
		return numberOfVehicles;

	}
	public String toString() {
		return "Vehicle type: " + type + " | count: " + numberOfVehicles; 
	}
}