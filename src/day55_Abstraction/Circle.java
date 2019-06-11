package day55_Abstraction;

public class Circle extends Shape {

	double radius;

	public Circle() {
		super("Circle");
	}

	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI + Math.pow(radius, 2);
	}

	@Override
	public void draw() {
		System.out.println("  ***  \n" + 
				" *   * \n" + 
				"*     *\n" + 
				"*     *\n" + 
				"*     *\n" + 
				" *   * \n" + 
				"  ***");
	}
}

/*
 * 5.1,create no arg constructor and call super class's one arg constructor
 */
