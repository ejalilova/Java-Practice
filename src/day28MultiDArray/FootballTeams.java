package day28MultiDArray;

import java.util.Arrays;

public class FootballTeams {
	public static void main(String[] args) {
		//declare multiD array with 2 raws and 6 columns
		String[][] teams = new String[2][6];
		
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		
		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";
		
		System.out.println("First player of first team:");
		System.out.println(teams[0][0]);
		System.out.println(teams[0][3]);
		System.out.println(teams[1][5]);
		//print how many rows/teams/arrays
		System.out.println("Number of rows: " + teams.length);
		System.out.println("People in first team: " + teams[0].length);
		System.out.println("People in first team: " + teams[1].length);

		System.out.println(Arrays.deepToString(teams));
		
		int[][] states = new int [3][4];
		states[0][0] = 535;
		states[0][1] = 7565;
		states[0][2] = 885;
		states[0][3] = 5353;
		
		states[1][0] = 5757;
		states[1][1] = 7535;
		states[1][2] = 3385;
		states[1][3] = 5359;
		
		states[2][0] = 9768;
		states[2][1] = 567;
		states[2][2] = 7764;
		states[2][3] = 777;
		
		System.out.println(Arrays.deepToString(states));
		System.out.println(Arrays.toString(states[0]));
		
		int[][] scores = { {3, 5, 10}, {6, 4, 2} };
		System.out.println("Days played/Number of arrays: " + scores.length);
		System.out.println("Number of values in 1: " + scores[0].length);
		System.out.println("Number of values in 2: " + scores[1].length);
		
		int [][] values = new int[4][];
		
		values[0] = new int[] {34, 23, 5};
		
		values[1] = new int [] {34, 55, 16, 97, 45, 67};
		
		values[2] = new int[2];
		values[2][0] = 55;
		values[2][1] = 88;
		
		values[3] = new int[] {5, 12, 55, 34, 32};
		
		System.out.println(Arrays.deepToString(values));
		
	}
	
}

