package TryingHomework;

public class HW104Arrayspart2 {
	public static void main(String[] args) {
		int[] nums = { 1, 5, 2, 1, 1 };
		int count = 0;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == 5 && nums[i + 1] == 5) {
				//System.out.println(true);
				count ++;
			//} else {
				//System.out.println(false);
			} 
			
		}
		if (count == 1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
