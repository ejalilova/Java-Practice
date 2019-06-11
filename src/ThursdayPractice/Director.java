package ThursdayPractice;

public class Director {
/*
 * Write a class Director taht contains:
	- private instance name type of String.
	- a constructor that accepts a String corresponding to the directors name.
	- a toString method that returns 'Name: name'.
 
 */
	private String name;
	public Director(String name) {
		this.name = name;
	}
	public String toString() {
		return "Name: " + name;
	}
	public String getName() {
		return name;
	}
}
