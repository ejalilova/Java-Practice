package TryingHomework;

import java.util.Arrays;

public class HW117ArraysCopyCertainValues {
	public static void main(String[] args) {
	    //System.out.println("-----EXAMPLE RUN ---------");
	  //  String[] numbers = {"zero", "one", "two","three","four"};
	   // System.out.println(Arrays.toString(getWithE(numbers)));
	    
	  
	  
	    public static String[] getWithE(String[] arr) {
	    
	    //TODO : YOUR CODE GOES HERE ----------------------
	   String fewerValues = "";
	    int count = 0;
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i].contains("e")) {
	        count++;
	      }
	    }
	    int n =0;
	    String[] fewValues = new String[count];
	    for (int j = 0; j < arr.length; j++) {
	      if(arr[j].contains("e")) {
	        fewValues[n] = arr[j];
	        n++;
	      }
	      }
	    
	    
	    
	    //YOUR CODE ENDS HERE -----------------------
	    
	    return fewValues;
	  }
	}
