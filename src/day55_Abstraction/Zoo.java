package day55_Abstraction;

public class Zoo {
	public static void main(String[] args) {

		//Animal animal = new Animal();//Cannon instantiate the type animal
		Cat fluffy = new Cat("Murka");
		fluffy.speak();
		Dog tuz = new Dog("Rex");
		tuz.setName("Poochi");
		tuz.speak();
		fluffy.eat();
		tuz.eat();
		
	}
}
