package TryingHomework;

import java.util.Scanner;

public class Examples {
	public static void main(String[] args) {

		double price = 0;
		double screenSize = 0.0;
		String storageType, screenType, cpu;
		int ram = 0;
		int space;
		String screenResolution;
		Scanner scan = new Scanner(System.in);
		// WRITE YOUR CODE HERE

		System.out.println("Select screen size: ");
		screenType = scan.next();

		if (screenSize == 13.3) {
			price = price + 200.0;
		} else if (screenSize == 15.0) {
			price = price + 300.0;
		} else if (screenSize == 17.3) {
			price = price + 400.0;
		}
		System.out.println("Select CPU type: ");
		cpu = scan.next();
		if (cpu.equals("i3")) {
			price = price + 150.0;
		} else if (cpu.equals("i5")) {
			price = price + 250.0;
		} else if (cpu.equals("i7")) {
			price = price + 350.0;
		}
		System.out.println("Select RAM size: ");
		ram = scan.nextInt();
		price += (ram / 4) * 50.0;

		System.out.println("Select storage type: ");
		storageType = scan.next();

		int memorySize = 0;
		System.out.println("Enter memory size: ");
		space = scan.nextInt();

		if (storageType.equals("HDD")) {
			price = price + 50.0;
			price += (space / 500) * 50.0;
		} else if (storageType.equals("SSD")) {
			price = price + 100.0;
			price += (space / 500) * 100.0;
		}

		System.out.println("Enter screen resolution: ");
		screenResolution = scan.next();
		
		 
		 if (screenResolution.equals("FULLHD") &&  screenResolution.equals("4K")) { 
			 price = price + 100.0;  
		 } else if (screenResolution.equals("FULLHD screen") && screenResolution.equals("4K screen")) { 
			 price = price + 200.0; 
		 
		 
		 }
		 System.out.println("Laptop price is: " + price);
	}
}
