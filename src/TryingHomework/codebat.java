package TryingHomework;

public class codebat {
	public static void main(String[] args) {
		int max = 0;
		int a = 10;
		int b = 20;
		if (a < 10 || a > 20 || b < 10 || b > 20) {

			System.out.println(0);
		}

		if (a > b) {
			max = max + a;
		} else if (b > a) {
			max = max + b;
		}
		System.out.println(max);

	}
}
