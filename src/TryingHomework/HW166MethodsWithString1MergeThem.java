package TryingHomework;

public class HW166MethodsWithString1MergeThem {
	public static void main(String[] args) {
		// String ymp = "13579";
		// System.out.println(ymp.substring(3));
		System.out.println(mergeStrings("1357","246"));
	}

	public static String mergeStrings(String one, String two) {
		String str = "";
		int len = 0;

		if (one.length() >= two.length()) {
			len = one.length();
		} else
			len = two.length();

		for (int i = 0; i < len; i++) {

			if (i < one.length()) {
				str += one.charAt(i);
			}

			if (i < two.length()) {
				str += two.charAt(i);
			}

		}
		return str;
	}
}