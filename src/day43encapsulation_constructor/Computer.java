package day43encapsulation_constructor;

public class Computer {
	private String brand;
	private String os;
	private double price;
	
	//add a constructor
	public Computer() {
		System.out.println("Computer constructor...");
		brand = "unknown";
		os = "unknown";
		
	}
	public Computer(String brand, String os, double price) {
		System.out.println("In 3 args constructor...");
		this.brand = brand;
		this.os = os;
		this.price = price;
		
	}
	private String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	private String getOs() {
		return os;
	}
	void setOs(String os) {
		this.os = os;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", os=" + os + ", price=" + price + "]";
	}
	
	

}
