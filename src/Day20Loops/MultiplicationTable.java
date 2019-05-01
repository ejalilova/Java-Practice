package Day20Loops;
import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
	
		
		if (num < 1 || num >10) {
			System.out.println("Invalid input");
			return; // stops execution or //System.exit(0);
		}
		
		for (int n = 1; n <=10; n++) {
			
			System.out.println(num+"x"+n+" = "+(num * n));
		}
				
		
		
		
		
	}

}
