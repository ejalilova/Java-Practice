package day27;

public class CanvasCourses {
	public static void main(String[] args) {
		/*
		 * 147 -> Java programming 204 -> Mentoring sessions 149 -> SDLC 152 -> QA
		 * Testing 144 -> Team activity 143 -> Welcome Kit --> split by "/" and get the
		 * last value from array --> convert it to integer. Integer.parseInt(...) -> int
		 * value --> switch statement and find the matching
		 */

		String url = "https://learn.cybertekschool.com/courses/149";
		String[] number = url.split("/");

		System.out.println("Length: " + number.length);

		System.out.println(number[number.length - 1]);
		int CourseID = Integer.parseInt(number[number.length - 1]);

		int courseID = Integer.parseInt(number[4]);
		
		switch (courseID) {
		case 147:
			System.out.println("Java programming");
			break;
		case 204:
			System.out.println("Mentoring sessions");
			break;
		case 149:
			System.out.println("SDLC 152");
			break;
		case 152:
			System.out.println("QA Testing");
			break;
		case 144:
			System.out.println("Team activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			
		}
	}

}
