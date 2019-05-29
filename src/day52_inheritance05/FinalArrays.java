package day52_inheritance05;

import java.util.Arrays;

public class FinalArrays {

	public static void main(String[] args) {
		final int[] TEAMS = new int[] {11, 11};
		System.out.println("Team1 : " + TEAMS[0]);
		System.out.println("Team2 : " + TEAMS[1]);
		
		TEAMS[0] = 10;
		TEAMS[1] = 9;
		
		System.out.println("Team1 : " + TEAMS[0]);
		System.out.println("Team2 : " + TEAMS[1]);
		
		//TEAMS = new int[] {10, 10, 10}; 
		//value can change, but not
		
		int[] nums = new int[] {23, 55, 35543};
		System.out.println(Arrays.toString(nums));
		
		nums = new int[] {4545, 575775, 3 ,6767, 5, 38, 9, 3, 5};
		System.out.println(Arrays.toString(nums));
		
		final int[] finalNums = {23, 66, 44, 11};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0] = 46465;
		System.out.println(Arrays.toString(finalNums));
		
		//finalNums = new int[] {22, 44, 56, 1123, 345}; wont work
		
		final double[] PRICES = new double[3];
		PRICES[0] = 85.5;
		PRICES[1] = 99.99;
		PRICES[2] = 99.98;
		
		System.out.println(Arrays.toString(PRICES));
		PRICES[0] = 81.1;
		System.out.println(Arrays.toString(PRICES));
		
		//PRICES = new double[3]; will not work
			
		
		
	}
}
