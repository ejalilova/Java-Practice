package TryingHomework;

import java.util.ArrayList;

public class HW192 {

}
public static void timesTwo(ArrayList<Integer> nums) {
	 int sum = 0;
	  for (int i = 0; i < nums.size(); i++) {
	  sum = nums.get(i) * 2;
	  nums.remove(i);
	  nums.add(i, sum);
	  
	  }
	  System.out.println(sum);
	}
}
