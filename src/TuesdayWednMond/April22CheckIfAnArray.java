package TuesdayWednMond;

public class April22CheckIfAnArray {
	public static void main(String[] args) {
		int n = 55;
		int nums[] = {22, 33, 55, 22, 11, 90};
		
		boolean present = false;
		
		for (int num : nums) {
			System.out.println(num);
			if (num == n) {
				present = true;
				break;
			}
		}
		System.out.println("Is " + n + " present? " + present);
	}

}



