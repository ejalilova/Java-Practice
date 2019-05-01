package day24ArraysMurodil;

public class PrintArraysValue {
	public static void main(String[] args) {
		//create array cars and directly assign following values:
//Audi, Porsche, BMW, Toyota, Tesla, Dodge, Kia, Acura, Fiat
		//String[] cars = new String[9];
		//cars[0] = "Audi";
		//cars[1] = "Porsche";
		//cars[2] = "BMW";
		//cars[3] = "Toyota";
		//cars[4] = "Tesla";
		//cars[5] = "Dodge";
		//cars[6] = "Kia";
		//cars[7] = "Acura";
		//cars[8] = "Fiat";
		
		//String car = cars[2];
		//System.out.println(cars[2]);
	String[] cars = {"Audi", "Porsche", "BMW", "Toyota", 
			"Tesla", "Dodge", "Kia", "Acura", "Fiat"};
	System.out.println(cars.length);
	int i = 0;
	System.out.println(cars[i]);
	i++;
	System.out.println(cars[i]);
	for(int c = 0; c < cars.length; c++) {
		System.out.println(cars[c]);
		
	}
	System.out.println("========= FOR EACH LOOP =======");
	//print all values using a for EACH loop
	for (String car : cars) {
		System.out.println(car);
	}
		int[] nums = {4, 7, 8, 5, 8};
		for (int n : nums) {
			System.out.println(n);
			
			
			
		}
	}
		
	}


