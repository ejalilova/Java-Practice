package day42CustomClassesAndEncapsulation;

public class Coffee {
	String name;
	String size;
	double price;
	double calories;

	public void getCoffeeInfo() {
		String info = "Name: " + name.toUpperCase() + " size: " + size.toUpperCase() + " price$ " + price + " CAL: "
				+ calories;
		System.out.println(info);
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setSize(String newSize) {
		if (newSize.equalsIgnoreCase("TALL") || newSize.equalsIgnoreCase("grande")
				|| newSize.equalsIgnoreCase("venti")) {
			size = newSize;
		} else {
			System.out.println("Error: Invalid Size - " + newSize);
			size = "unknown";
		}
	}

	public void setPrice(double newPrice) {
		price = newPrice;
	}

	public void setCalories(int newCal) {
		calories = newCal;
	}

	public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCal) {
		name = newName;
		setSize(newSize);
		price = newPrice;
		calories = newCal;

	}
}
