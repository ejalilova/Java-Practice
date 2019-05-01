package day18while_do_while;

public class StairCase {
	public static void main(String[] args) {
		/*
		 **
		 ***
		 **** 
		 *****
		 ******
		 *******
		 */

		String stairs = "*";
		// System.out.println(stairs);

		// stairs = stairs + stairs;
		// System.out.println(stairs);
		// stairs += "*";
		// System.out.println(stairs);

		// 1) with a counter
		int num = 1;
		while (num <= 10) {
			System.out.println(stairs);
			stairs += "*";
			num++;
		// 2) checking length
			
		String stairs2 = "&";
		while(stairs2.length() <=10) {
			System.out.println(stairs2);
			stairs2 += "&";
			
		}
		
		}

	}

}
