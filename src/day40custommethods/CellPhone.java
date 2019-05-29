package day40custommethods;

public class CellPhone {
	String brand;
	double screenSize;
	String collor;
	double price;
	
	public static void main(String[] args) {
		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		cell1.brand = "Nokia";
		cell1.screenSize = 5.7;
		cell1.collor = "blue";
		cell1.price = 78.9;
	}
	
	public void call() {
		System.out.println("Calling...");
	}
public void message() {
	System.out.println("Messaging...");
}
public void takeAPhoto() {
	System.out.println("Taking photo...");
}
}
