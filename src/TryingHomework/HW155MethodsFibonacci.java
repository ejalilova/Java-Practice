package TryingHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HW155MethodsFibonacci {
public static void main(String[] args) {
	
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    
    fib(num);
  }
  
  public static void fib(int num){
    //WRITE YOUR CODE HERE
  	  int[] feb = new int[num];
  	  feb[0] = 0;
  	  feb[1] = 1;
    for (int i = 2; i < num; i++) { 
      
      feb[i] = feb[i-1] + feb[i-2]; 
  } 
  System.out.println(Arrays.toString(feb));
  System.out.println(feb[num-1]); 
} 
}