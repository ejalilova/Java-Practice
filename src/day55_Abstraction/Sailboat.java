package day55_Abstraction;

public class Sailboat extends Vehicle {
	private int length;

	public Sailboat(double price, int length) {
		super(0, price, "sail boat", "wind");
		this.length = length;
	}

	public void move() {
		System.out.println("Sails...");
	}

	public int getLength() {
		return length;
	}
}
