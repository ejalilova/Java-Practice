package TryingHomework;

public class HW104ArraysHas55 {
	public static void main(String[] args) {
		int[] nums = { 1, 5, 5, 1, 1 };
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int k = 1; k < nums.length; k++) {
				if (nums[i] == 5 && nums[k] == 5) {
					count++;
				} else {
					count = count + 0;

				}
			}
			if (count == 1) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

	}

}
