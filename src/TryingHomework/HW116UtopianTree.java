package TryingHomework;

public class HW116UtopianTree {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		//int sum2 = 0;
		
		for (int i = 0; i < 3; i++) {
			count++;
			// sum = sum + i;
			sum++;

			System.out.println("year " + count + " - growth 1 cm");
			System.out.println("tree size: " + sum + " cm");
		}
		for (int k = 4; k <= 10; k++) {
			count++;
			//sum2 = sum + 2;
			sum = sum + 2;
			
			System.out.println("year " + count + " - growth 2 cm");
			System.out.println("tree size: " + sum + " cm");
		}
	}

}
