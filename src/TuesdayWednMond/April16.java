package TuesdayWednMond;

public class April16 {
	public static void main(String[] args) {
		String today = "tuesday";
		String t = today.substring(0, 4);
		String d = today.substring(4);
		System.out.println(t + "\n" + d);
		// reverse string

		String reverse = "";
		for (int i = today.length() - 1; i >= 0; i--) {
			reverse = reverse + today.charAt(i);
		}
		System.out.println(reverse);

		System.out.println(today.charAt(6) + "\n" + today.charAt(5) + "\n" + today.charAt(4) + "\n" + today.charAt(3)
				+ "\n" + today.charAt(2) + "\n" + today.charAt(1) + "\n" + today.charAt(0));
		System.out.println();
		String tomorrow = "thursda";
		System.out.println(tomorrow.substring(6) + " " + tomorrow.substring(5, 6) + " " + tomorrow.substring(4, 5) + " "
				+ tomorrow.substring(3, 4) + " " + tomorrow.substring(2, 3) + " " + tomorrow.substring(1, 2) + " "
				+ tomorrow.substring(0, 1));

		for (int i = 0; i < today.length(); i++) {
			System.out.print(today.charAt(i));
			System.out.print(today.substring(i, i + 1));

		}

		for (int j = today.length() - 1; j >= 0; j--) {
			System.out.print(today.charAt(j) + " ");
			System.out.println();
		}

		// String today = "tuesday";
		for (int k = today.length() - 1; k >= 0; k--) {
			System.out.print(today.substring(k, k + 1));
		}
		// assign to variable
		String word = "Friday";
		String reversed = "";
		for (int z = word.length() - 1; z >= 0; z--) {
			reversed = reversed + word.charAt(z);
			
		}
		System.out.print(reversed);
		
		if (word.equalsIgnoreCase(reversed)) {
			System.out.println("Polindrome");
		}	else {
				System.out.println("not");
			}
		}
	}

