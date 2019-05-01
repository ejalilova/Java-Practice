package day23Arrays;

public class Arrays1 {
	public static void main(String[] args) {
		int [] numbers = new int[3];
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		//assign to the first element in the array value of num1
		numbers [0] = num1;
		numbers [1] = num2;
		numbers [2] = num3;
		
		numbers [0] = 7;
		numbers [1] = 8;
		//numbers [2] = "A"; we cannot provide different data type/use data type of array
				
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println("*****************");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		String[] names2 = {"Leo", "John", "Anna"};
		System.out.println(names2[1]);
		System.out.println("Number of names: " + names2.length);
	
}

}
