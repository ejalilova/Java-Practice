package day55_Abstraction;

public class ShapeGenerator {
	public static void main(String[] args) {
		Circle circle1 = new Circle(10);
		System.out.println("Area: " + circle1.calculateArea());
		circle1.draw();

		Triangle triangle1 = new Triangle(5, 5, 5);
		triangle1.draw();
		System.out.println("Area: " + triangle1.calculateArea());
	}
}
