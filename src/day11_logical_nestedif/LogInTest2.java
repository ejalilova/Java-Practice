package day11_logical_nestedif;
import java.util.*;
public class LogInTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String validUserName = "cybertek@gmail.com";
		String validPassword = "WoodenSpoon123";
		
		
		System.out.println("Please enter your username");
		String userName = scan.next();
		
		System.out.println("Please enter your password");
		String password = scan.next();
		
		if (userName.equals(validUserName) && password.equals(validPassword)) {
			System.out.println("Log in successfull, Welcome!");
		} else if (!userName.equals(validUserName) && !password.equals(validPassword)) {
			System.out.println("Invalid username and password");
		} else if (userName.equals(validUserName) && !password.equals(validPassword)) {
			System.out.println("Invalid Password!");
		} else if (!userName.equals(validUserName) && password.equals(validPassword)) {
			System.out.println("Invalid Username!");
		}
	}

}
