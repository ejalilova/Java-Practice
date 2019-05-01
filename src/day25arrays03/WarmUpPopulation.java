package day25arrays03;

public class WarmUpPopulation {
	public static void main(String[] args) {
		// create an array called population that can accept count for 5 cities
		// assign some values to each city

		int[] population = new int[5];
		population[0] = 5000;
		population[1] = 10000;
		population[2] = 7000;
		population[4] = 8907;
		population[3] = 4455;

		System.out.println(population[0]);
		int[] population2 = { 5000, 10000, 7000, 4455, 4455 }; // second version to print
		System.out.println("City 0 population: " + population[0]);
		System.out.println("City 1 population: " + population[1]);
		System.out.println("City 2 population: " + population[2]);
		
		int idx = 0;
		System.out.println("City 0 population: " + population[idx]);
		idx++;
		System.out.println("City 1 population: " + population[idx]);
		
		String str = "ab";
		System.out.println("City STR.LENGTH() 1 population: " + population2[str.length()]); 
		
		//String array called cities, assign cities "Miami", "London", "Tokyo", "Rome", "New York"
		String[] cities = {"Miami", "London", "Tokyo", "Rome", "New York"};
		
		//population of Miami is 5000
		System.out.println("Population of " + cities[0] + " is "  + population[0]);
		System.out.println("Population of " + cities[1] + " is "  + population[1]);
		System.out.println("Population of " + cities[2] + " is "  + population[2]);
		System.out.println("Population of " + cities[3] + " is "  + population[3]);
		System.out.println("Population of " + cities[4] + " is "  + population[4]);
		
		
		
		
		
		
		
		
	
	}

}
