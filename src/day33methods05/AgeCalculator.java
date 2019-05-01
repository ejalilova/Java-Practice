package day33methods05;

public class AgeCalculator {
	public static void main(String[] args) {
		int age = calculateAge(1982);
		System.out.println("You are " + age + " old");
		int age2 = calculateAge(1975);
		System.out.println("You are " + age2 + " old");
		System.out.println(calculateAge(2025));
	}

	public static int calculateAge(int year) {
		int currentYear = 2019;
		int age = currentYear - year;
		if (age < 0) {
			System.out.println("Negative, invalid age");
			return 0;
		} else if (age >= 0 && age <= 14) {
			System.out.println("child");
		} else if (age >= 15 && age <= 25) {
			System.out.println("yongster");
		} else if (age >= 26 && age <= 64) {
			System.out.println("adult");
		} else {
			System.out.println("senior");
		}
		return age;
	}
}






/*
 * 1-14 child 15-25 yongster 26-64 adult age 65 > senior age negative = negative
 * invalid age calculate age and return value
 * 
 */
