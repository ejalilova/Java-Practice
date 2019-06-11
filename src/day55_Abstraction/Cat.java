package day55_Abstraction;

public class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}
		@Override
		public void speak() {
			System.out.println("meowwwwwwwwwwwwww");
		}
		public void eat() {
			System.out.println("fish");
		}
}
