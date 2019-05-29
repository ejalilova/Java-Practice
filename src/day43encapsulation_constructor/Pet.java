package day43encapsulation_constructor;

public class Pet {
	private String type;
	private String name;

	public Pet(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public Pet() {
		System.out.println("No-args constructor");
	}

	public void speak() {
		switch (type.toLowerCase()) {
		case "cat":
			System.out.println("Myauu");
			break;
		case "dog":
			System.out.println("gav gav | woof woof | waw waw");
			break;
		case "bird":
			System.out.println("chik chirik");
			break;
		case "goat":
			System.out.println("mhaaa mhaaa");
			break;
		case "ship":
			System.out.println("bhaaaa bhaaa");
			break;
		case "rooster":
			System.out.println("kukareku");
			break;
		default:
			System.out.println("...");
		}
	}

	private String getType() {
		return type;
	}

	private void setType(String type) {
		this.type = type;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}

}
