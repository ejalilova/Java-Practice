package TryingHomework;

import java.util.Arrays;
import java.util.Scanner;

public class hw126 {
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for (int i = 0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for (int j = 0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		*/
		// WRITE YOUR CODE HERE

		boolean result =contains(new int[] {2,3,4,5,6}, new int[] {6,4});
		System.out.println(result);
		//contains(outer, inner);


	}
	
	public static boolean contains(int[] outer, int[] inner)
	{
		boolean notFound = true;
		
		for (int i = 0; i < inner.length; i++) {
			notFound = true;
			for (int j = 0; j < outer.length && notFound; j++) {
				if (inner[i] == outer[j]) {
					notFound = false;
					//System.out.println("Found: " + inner[i]);
				}
				
			}
			if (notFound) {
				return false;
			}
		}
		return true;
	}
}