package day49Inheritance02;

//TV is a Sub/Child class in the same Package
public class TV extends Device {

	public void watch() {
		System.out.println("Watching TV - " + brand + " model: " + model);
		System.out.println("Price: " + price);
		//System.out.println("Made in " + country); not visible
	}
}
