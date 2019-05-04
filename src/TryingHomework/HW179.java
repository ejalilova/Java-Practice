package TryingHomework;

public class HW179 {
	public static void main(String[] args) {
		System.out.println(reverse("I love Java"));
	}

	public static String reverse(String input) {
		String result = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			result += input.charAt(i);

		}
		return result;
	}
}