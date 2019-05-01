package TryingHomework;

public class HW167MethodsWithString2Unique {
	public static void main(String[] args) {
		
		// test your code
		System.out.println(uniqueChars("wooden-spoon"));
	}

	public static String uniqueChars(String str) {
		// TODO: write your below
		String results = "";
		for (int i = 0; i < str.length(); i++) {
			String current = "" + str.charAt(i);
			//System.out.print(current);
			//System.out.println(results);
			if (!results.contains(current)) {

				results += current;
			}

		}
		return results;
	}
}
