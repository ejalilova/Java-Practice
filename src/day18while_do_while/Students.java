package day18while_do_while;

public class Students {
	public static void main(String[] args) {
		int numberOfStudents = 1;

		// using a loop, iterate until we have 10 students in the room
		// in the room
		// Student1
		// Student2
		// until 10 No more space

		while (numberOfStudents <= 10) {
			System.out.println("Student " + numberOfStudents);
			numberOfStudents++;

		}
		System.out.println("No more space");
	}

}
