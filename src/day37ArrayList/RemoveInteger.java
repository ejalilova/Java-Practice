package day37ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveInteger {
	public static void main(String[] args) {
List<Double> prices = Arrays.asList(5.6, 6.7, 8.2, 98.6, 256.5, 345.4);
		System.out.println(prices);
		double sum = 0;
		for (double p : prices) {
			sum += p;
		}
		System.out.println(sum);
		double sum2 = 0;
		for (int i = 0; i < prices.size(); i++) {
			sum2 += prices.get(i);
			
		}
		System.out.println(sum);
		List<Double> expensive = new ArrayList<>();
		//for (int i = 0; i < prices.size(); i++) {
		//	if (prices.get(i) > 100) {
			//	expensive += prices.get(i);
		for (double price : prices) {
			if (price > 100) {
				expensive.add(price);
			}
			
		}
		System.out.println(expensive);
	}
}
