package TryingHomework;

import java.util.Scanner;

public class HW92Factorial {
	public static void main(String[] args) {
		
		   Scanner scan = new Scanner(System.in);
		   
		   int n = scan.nextInt();
		   
		   long factorial = 1L;
		    for(int i=1; i <= n; i++){
		    factorial = factorial * i;
		    
		   }
		    System.out.println(factorial);
	}
}

