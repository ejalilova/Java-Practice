package day24ArraysMurodil;

public class SearchInArray {
	public static void main(String[] args) {
		
		int[] nums = {20, 6, 8, 5, 100, 2, 1, 9, 4, 3};
		int lookfor = 100;
		boolean found = false;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == lookfor) {
		System.out.println(lookfor+" was found at index " + i);
		found = true;
		break; //put because looking for first 100 only
		//	} else {
		//		System.out.println(lookfor + " not found");
				//break;
		
		
			}
		}
		if (found == false) { // or easier - if(!found)
			System.out.println(lookfor + " not found");
		}
	}

}


