package day23Arrays;

public class PrintNumbers2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if ((i % 5 == 0) && (i % 20 !=0)) {
				continue;
			}
			if (i % 20 == 0) {
				break;
			}
			System.out.print(i + ",");
		}
	}

}
