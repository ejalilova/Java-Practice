package TuesdayWednMond;

public class AllUniqueMyPractice {
	public static void main(String[] args) {
String str = "spoon";// s p o n
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			int count = 0;
			for (int k = 0; k < str.length(); k++) {
				if (temp == str.charAt(k) ) {
					count++;
					//break;
				}
			}
			if (count == 1) {
				System.out.println(temp);
			}
		}

	}

}
