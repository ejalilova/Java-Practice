package day29;

public class Student {
	public static void main(String[] args) {
		sayHello();//calling the method
		study();
		study();
		code();
	}
	public static void study() {
		System.out.println("Student is studying");
	}
	// create a method sayHello that prints "Hello friends!"
	public static void sayHello() {
		System.out.println("Hello friends!");
		System.out.println("How are you today?");
	}
	// create a method code - Student is coding Java
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding Java");
	}
}
