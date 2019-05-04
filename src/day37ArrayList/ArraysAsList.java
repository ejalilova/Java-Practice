package day37ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
	public static void main(String[] args) {
		List<String> cars = Arrays.asList("Tesla", "Porsche", "Lexus", "Honda");
		List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		//nums.add(100);
		//System.out.println(nums.toString());//cannot modify array
		
		//create array list called prices
		//assign values using Arrays.aslist method
		
		List<Double> prices = Arrays.asList(3.2, 7.6, 8.2, 115.5, 789.1, 15.2, 4.4, 67.4, 21.4, 55.5);
		System.out.println(prices);
		double sum = 0;
		for (double price : prices) {
			sum += price;
			
		}
		System.out.println(sum);
		double sum2 = 0;
		for (int i = 0; i < prices.size(); i++) {
			sum2 += prices.get(i);
		}
		System.out.println(sum2);
		
		//create new list expensive
		//add prices that are more than 100
		
		List<Double> expensive = new ArrayList<>();
		
		for(double price : prices) {
			if(price > 100.0) {
				expensive.add(price);
			}
		}
		System.out.println(expensive.toString());
		

	}

}
