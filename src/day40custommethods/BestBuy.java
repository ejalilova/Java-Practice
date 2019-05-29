package day40custommethods;

public class BestBuy {
	public static void main(String[] args) {
		//System.out.println(brand);
		//above line will not work, need to create object 
		//to use brand
		//create cellPhone object
		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.collor = "Silver";
		cell1.price = 76.16;
		
		System.out.println("Brand: " + cell1.brand);
		System.out.println("Screen size: " + cell1.screenSize);
		System.out.println("Color: " + cell1.collor);
		System.out.println("Price: " + cell1.price);
		
		CellPhone cell2 = new CellPhone();
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.collor = "blue";
		cell2.price = 39.22;
		
		System.out.println("####### CELL 2 VALUES #######");
		System.out.println("Brand: " + cell2.brand);
		System.out.println("Screen size: " + cell2.screenSize);
		System.out.println("Color: " + cell2.collor);
		System.out.println("Price: " + cell2.price);
		
		System.out.println("####### CALLING METHODS #######");
		cell1.call();
		cell1.message();
		cell2.call();
		cell2.message();
		cell2.call();
		cell1.takeAPhoto();
		cell2.takeAPhoto();
	}
}

