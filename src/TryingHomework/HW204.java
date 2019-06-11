package TryingHomework;

import java.util.Arrays;

public class HW204 {

	public static int[] populate(int[] r) {

		for (int k = 0; k < r.length; k++) {
			r[k] = k + 1;

			// System.out.println(Arrays.toString(r));
			// System.out.println(k);

		}
		return r;
	}

	public static void main(String[] args) {

		int[] i = new int[3];
		i = populate(i);
		System.out.println(Arrays.toString(i));

	}
}