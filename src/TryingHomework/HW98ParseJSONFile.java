package TryingHomework;

import java.util.Scanner;

public class HW98ParseJSONFile {
	public static void main(String[] args) {

		   Scanner scan = new Scanner(System.in);
			String json = scan.nextLine();
			
		//	String firstName = json.substring(json.indexOf("firstName")+13, json.indexOf("\",") //, json.indexOf(firstName"))); 
			String firstName = json.substring(json.indexOf("firstName")+13, json.indexOf("\",")); //json.indexOf("\""))); 
			String lastName = json.substring(json.indexOf("lastName")+12, json.indexOf("\", \"role\""));
			
//		StringLastname = json.substring(json.indexOf("\"lastName\": \"");
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		
	  }
	}
/* Example:
input:{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
output:
First name: James
Last name: May
*/