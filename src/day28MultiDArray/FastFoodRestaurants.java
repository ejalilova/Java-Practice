package day28MultiDArray;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		// read all data and assign to String array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);

		System.out.println("Data size: " + data.length);
		// print first row
		System.out.println(data[0]);
		System.out.println(data[1]);
		// print last restaurant
		System.out.println(data[data.length - 1]);
		// print each Restaurant information in separate line
		int counter = 0;
		for (String eachRow : data) {
			System.out.println("#" + counter + "=>" + eachRow);
			counter++;
		}
		// print all restaurant information in state of Virginia and count how many
		int countVA = 0;
		for (String row : data) {
			if (row.contains(",VA,")) {
				System.out.println(row);
				countVA++;
				// int countVA = countVA + row;
			}
		}
		System.out.println("Number for VA is: " + countVA);
		//find all restaurnats in state of VA
		//print the restaurant names along with city name
		//ex: Subway - Herndon
		
		//String[] splitData = row.split(",");
		for (String res : data) {
			if (res.contains(",VA,")) {
				String [] resArr = res.split(",");
				System.out.println(resArr[2] + " - " + resArr[1]);
			}
		}
		
	}
}
