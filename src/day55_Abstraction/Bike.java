package day55_Abstraction;

public class Bike extends Vehicle {

	public Bike(int wheels, double price) {
		super(wheels, price, "Bicycle", "a person");

	}

	public void move() {
		System.out.println("Cycling");
	}
}
