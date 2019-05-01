package TryingHomework;

import java.util.Scanner;

public class hw {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();
		String answer = "";
		
		if (count == 1) {
			System.out.println(word);
		}else {
			for (int i = 0; i < count - 1; i++) {
				answer += word + separator;

			}
			System.out.print(answer + word);
		}
		
		
	}

}
