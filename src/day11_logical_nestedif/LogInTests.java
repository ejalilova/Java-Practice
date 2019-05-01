package day11_logical_nestedif;
import java.util.*;
public class LogInTests {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your username");
		String username=scan.next();
		
		System.out.println("Please enter your password");
		String password=scan.next();
		
		String validUsername = "cybertek@gmail.com";
		String validPassword = "WoodenSpoon123";
		
		if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)){
		System.out.println("Login succesfull! Welcome!");
		
		
		}else if (!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)){
			System.out.println("Invalid user name and password");
		
			
		}else if (username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)){
				System.out.println("Invalid password");
		
				
		}else if (!username.equalsIgnoreCase(validUsername) && password.equals(validPassword)){
					System.out.println("Invalid username");
					
		}
		
		
		}

}
