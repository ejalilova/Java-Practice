package TryingHomework;

import java.util.Scanner;

public class HW102 {
	public static void main(String[] args) {
		  
		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    String[] splited = sentence.split(" ");
		    String reversed = "";
		  for(int i = splited.length -1; i >= 0; i --) { 
		    reversed = reversed + splited[i] + "\n";
		      
		      //System.out.print();
		    }
		    
		   reversed = reversed.trim();
		    System.out.println(reversed);
		  }
		}

