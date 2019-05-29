package TryingHomework;

public class HW179 {
	
		import java.util.Arrays;
		class Main {
		  public static int[] mergR(int[] a,int[] b) {
		    int length = a.length + b.length;
		    int[] willReturn = new int [length];
		    int z = 0;
		    for (int i = 0; i < a.length; i++) {
		      willReturn[z] = a[i];
		      z++;
		    }
		  
		   for (int j = 0; j < b.length; j++) {
		      willReturn[z] = b[j];
		      z++;
		   }
		   return willReturn;
		  }//end mergR
		
		  public static void main(String[] args) {
		  
		  }
		
		}