package Practice;

public class UniqueNumbers {
	public static void main(String[] args) {
		int[] nums = { 7, 4, 1, 4, 1, 5, 9, 9, 3 };

		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			int counter = 0;

			for (int k = 0; k < nums.length; k++) {

				if (nums[k] == temp && i != k) {
					counter++;
					break;
				}
			}
			if (counter == 0) {
				System.out.println(temp);

			}

		}

	}
}
