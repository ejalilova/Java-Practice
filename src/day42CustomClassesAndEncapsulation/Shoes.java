package day42CustomClassesAndEncapsulation;

public class Shoes {

	String brand;
	double size;

	public void setShoesData(String newBrand, double nSize) {
		brand = newBrand;
		size = nSize;
	}

	// read only
	public String getShoesData() {
		return brand + " | " + size;
	}
}