package Day20Loops;

public class WeekDays {
	public static void main(String[] args) {
		// 1-7
		// 1 - Monday
		// 2 - Tuesday
		
		for (int numberOfDays = 1; numberOfDays <= 7; numberOfDays++) {
			switch (numberOfDays) {
			case 1:
				System.out.println(numberOfDays + " - Monday");
				break;
			case 2:
				System.out.println(numberOfDays + " - Tuesday");
				break;
			case 3:
				System.out.println(numberOfDays + " - Wednesday");
				break;
			case 4:
				System.out.println(numberOfDays + " - Thursday");
				break;
			case 5:
				System.out.println(numberOfDays + " - Friday");
				break;
			case 6:
				System.out.println(numberOfDays + " - Saturday");
				break;
			case 7:
				System.out.println(numberOfDays + " - Sunday");
				break;
			default:
				System.out.println("Invalid day");

			}
		}

	}

}
