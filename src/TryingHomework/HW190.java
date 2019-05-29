package TryingHomework;

import java.util.ArrayList;

public class HW190 {

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> numbers) {
		ArrayList<Integer> result = new ArrayList<>();

		int sum = 0;

		for (int number : numbers) {

			if (number > 0) {
				result.add(number);

				sum += number;

			}
		}

		result.add(sum);

		return result;
	}

}
