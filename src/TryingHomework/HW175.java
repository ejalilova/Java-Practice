package TryingHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW175 {
	public static String lameDb(String db, String op, String id, String data) {
		String[] values = new String[4];
		int ii = 0;
		for (String value : (db.split("#"))) {
			values[ii++] = value;
		}
		int idx = Integer.valueOf(id) - 1;

		System.out.println(Arrays.toString(values));
		switch (op) {
		case "add":
			// values.remove(idx);
			values[idx] = data;
			break;
		case "edit":
			break;
		case "delete":
			break;
		case "none":
			break;
		}
		System.out.println(Arrays.toString(values));

		return String.join("#", values);

	}// end lameDb

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}

}
