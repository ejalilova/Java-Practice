package day55_Abstraction;

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	public void speak() {
		System.out.println("woof woof");
	}
	public void eat() {
		System.out.println(getName() + " eats");
	}
}
