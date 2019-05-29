package day46statickeyword;

public class Ebay {
	public static void main(String[] args) {

		Customer cm1 = new Customer("Abdallah Aleies", "AbdallahAleies@gmail.com");
		Customer cm2 = new Customer("Adilet Kyrgyz", "AdiletKyrgyz@yahoo.com");
		Customer cm3 = new Customer("Anastasiya Zasibna", "Anastasiya@outlook.com");
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		Customer cm4 = new Customer("Bural Ukal", "BuralUkal@gmail.com");
		
		cm1.count = 10;
		//cm3.count = 3;
		System.out.println(cm3.count);
		System.out.println(Customer.count);
	}
}



