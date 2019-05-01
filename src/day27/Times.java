package day27;

public class Times {
	public static void main(String[] args) {
		// declare 2 int arrays with time 1 and time 2
		// both of them have 2 items/values that represent hour an minute
		// hours: 0-23/ minutes 0-59
		// array time 1 = {11, 10}
		int[] time1 = new int[2];// 0,0 by default
		int[] time2 = new int[2];// 0,0 by default

		time1[0] = 10;
		time1[1] = 15;

		time2[0] = 16;
		time2[1] = 100;

		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time has invalid hour");
			return;

		}
		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time has invalid minute");
			return;

		}
		if (time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time has invalid hour");
			return;

		}
		if (time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time has invalid minute");
			return;

		}
		// compare arrays and tell which one is earlier // compare hours
		if (time1[0] > time2[0]) {
			System.out.println("Time 1 is earlier");
		} else if (time2[0] < time1[0]) {
			System.out.println("Time 2 is earlier");
		} else {
			if (time1[1] < time2[1]) {
				System.out.println("Time 1 is earlier");
			} else if (time2[1] < time1[1]) {
				System.out.println("Time 2 is earlier");

			} else {
				System.out.println("Same time!");
			}
		}

	}

}
