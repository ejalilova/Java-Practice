package Day17stringpool_whileloop;
import java.util.Scanner;
public class Warmup {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String message = scan.nextLine();
	    
	    String sender = (message.substring(message.indexOf("<") + 1, message.indexOf(">")));
	    System.out.println(sender);
	    String phoneNumber = (message.substring(message.indexOf("[") + 1, message.indexOf("]")));
	    System.out.println(phoneNumber);
	    String messageBody = (message.substring(message.indexOf("{") + 1, message.indexOf("}")));
	    System.out.println(messageBody);
		
		
		
		
		
		
	}
	//Sender:<Mike Smith>. From Number:[202-123-3456] Message:{I love programing and problem solving}
	//Sender: Mike Smith
	//Phone Number: 202-123-3456
	//Message body: I love programing and problem solving

}
