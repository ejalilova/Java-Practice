package TryingHomework;
import java.util.Scanner;			
public class homework8 {
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		    String firstName = email.substring(0, email.indexOf("_"));
		    
		    String lastName = email.substring(email.indexOf("_") +1, email.indexOf("@"));
		   
		    String domain = email.substring(email.indexOf("@") +1, email.indexOf("."));
		    
		    int dotIndex = email.lastIndexOf(".");
		    String extension = email.substring(dotIndex +1, email.length());
		    
		    String firstNameCap=firstName.substring(0,1).toUpperCase() + firstName.substring(1);
		    String lastNameCap=lastName.substring(0,1).toUpperCase() + lastName.substring(1);
		   		    
		    System.out.println("First name: " + firstNameCap);
		    System.out.println("Last name: " + lastNameCap);
		    System.out.println("Domain: " + domain);
		    System.out.println("Top-Level Domain: " + extension);
		    
		  }
		}
/*
Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com

*/
