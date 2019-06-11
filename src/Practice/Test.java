package Practice;

import java.util.Scanner;

public class Test {


/**
* Reverses the order of the elements in the specified array
	 * @param arr
	 * @return array of strings
	 */
public static String[] reverse(String[] arr) {
		for(int i = 0; i < arr.length-1; i--){
		  arr = arr(i);
		}
		return arr;
	}
}