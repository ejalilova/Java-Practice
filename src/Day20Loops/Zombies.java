 package Day20Loops;

import java.util.*;

public class Zombies {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of inhabitants");
		int inhabitants = scan.nextInt();
		int day = 0;
		
		while (inhabitants > 0) {
			System.out.println("Day"+day+ "[" + inhabitants + "]");
			inhabitants = inhabitants /2;
			day ++;
			
			
		}
		
		System.out.println("---- EXTINCT ----");
		
		
		
		
	}
}