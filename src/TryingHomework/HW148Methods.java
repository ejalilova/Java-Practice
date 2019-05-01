package TryingHomework;
import java.util.Scanner;
public class HW148Methods {
	public static void main(String[] args) {
	
		    Scanner inp = new Scanner(System.in);
		    int size = inp.nextInt();
		    
		    int[] arr = new int[size];
		    for(int i=0 ;i<=size-1;i++) {

		        arr[i]=inp.nextInt();
		    }
		    //#2 Your code here
		    
		  isPos(size);
		  }
		  
		  public static void isPos(int num)
		  {
		    //#1 your code here
		   for (int i = 0; i < num; i++) {
		    if (num < 0) {
		      System.out.println("not positive");
		        
		      } else if (num >= 0){
		              System.out.println("positive");

		      }
		    }
		   }
		  }