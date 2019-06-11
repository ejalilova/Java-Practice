package day55_Abstraction;

public abstract class Animal {
	
	public Animal(String name) {
		this.name = name;
	}
	private String name;
	public abstract void speak();//we cannot have abstract methods in regular classes
	public abstract void eat();
	//dog speaks: woof woof
	//cat speaks: meow
	//pig: oink oink
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
