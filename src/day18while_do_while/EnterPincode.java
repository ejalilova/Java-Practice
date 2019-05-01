package day18while_do_while;
import java.util.Scanner;
public class EnterPincode {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int secretPincode = 2222;
	
	int pincode = 0;
	
	//keep asking for a pin code until correct one entered
	
	while (pincode != secretPincode) {
		
		System.out.println("Enter pincode");
		pincode = scan.nextInt();
	}
	System.out.println("Access granted, select operation");
	
	
}
}
