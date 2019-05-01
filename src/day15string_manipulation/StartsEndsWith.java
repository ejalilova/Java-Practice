package day15string_manipulation;

public class StartsEndsWith {
	public static void main(String[] args) {

		String word1 = "eclipse";
		// startsWith - tests if string starts with another string
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("eclipse"));
		System.out.println(word1.startsWith("ecli"));
		System.out.println("");
		System.out.println(word1.startsWith("Ec"));

		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("java"));

		// "PSE
		
		System.out.println(word1.toUpperCase().endsWith("PSE"));// true
		System.out.println(word1.endsWith("eclipse")); // true

		// Mr. - male // Mrs. - married woman // Ms. - Single woman // Dr. - Doctor man
		// or woman // none matches - unknown status
		String name = "Mr. Jackson";

		if (name.startsWith("Mr.")) {
			System.out.println("male");
		} else if (name.startsWith("Mrs.")) {
			System.out.println("Married woman");
		} else if (name.startsWith("Ms.")) {
			System.out.println("Single woman");
		} else {
			System.out.println("unknown status");
		}
	}
}