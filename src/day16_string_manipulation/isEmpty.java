package day16_string_manipulation;

public class isEmpty {
	public static void main(String[] args) {

		String userName = " ";
		System.out.println(userName.isEmpty());

		String userName2 = "";
		System.out.println(userName2.isEmpty());

		if (userName.isEmpty()) {
			System.out.println("username field cannot be empty");
		} else {
			System.out.println("username is not empty");
		}

		String password = "";

		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("username and password cannot be empty");
		} else {
			System.out.println("is not empty");

			if (userName.length() == 0) {
				System.out.println("username length is 0, so it is empty");
			}

		}
	}

}

