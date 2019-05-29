package day50_inheritance03;

public class TestAnimals {
	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		an.move(3);
		cat.move(5);
		dog.move(7);
		duck.move(65);
		
	}
}
