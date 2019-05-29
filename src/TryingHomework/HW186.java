package TryingHomework;

public class HW186 {

	public static String extractNum(String input) {
		// Character.isDigit(ch)
		String result = "";
		for (char number : input.toCharArray()) {
			if (Character.isDigit(number)) {
				result += number;
			}
		}
		return result;
	}
}
