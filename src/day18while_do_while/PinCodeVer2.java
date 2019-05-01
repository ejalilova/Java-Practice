package day18while_do_while;
import java.util.Scanner;
public class PinCodeVer2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int secretPincode = 4321;
		
		//give only 3 attempts
		//if attempts reaches more than 3 print card blocked
		
		int pinCode = 0;
		
		int attempts = 0;
		
		while (pinCode != secretPincode) {
			System.out.println("enter pincode");
			pinCode = scan.nextInt();
			attempts++;
			
			if (attempts == 3 && pinCode != secretPincode) {
				System.out.println("card is blocked");
				return;
			
		}
		
		System.out.println("Access granted. Select operation");
			
		}
		
	}

}
