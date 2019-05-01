package day31Methods;

public class Authentication {
	public static void main(String[] args) {
		login("mentoring@cybertekschool.com", "mentor001");
	}
	/*name: log in 
	 * return type: void
	 * 2 String params/args: username, password
	 * inside the method:
	 * valid username = mentoring@cybertekschool.com
	 * valid password = mentor001
	 * if username and password match, print "Login Successfull! Welcome to Okta!"
	 * if not: "Sign in failed"
	 */
	
	

	public static void login(String username, String password) {
		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "mentor001";
		if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Successfull! Welcome to Okta!");
		} else {
			System.out.println("Sign in failed");
		}
	}
	
}
