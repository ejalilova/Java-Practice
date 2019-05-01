package day28MultiDArray;

import java.util.Arrays;

public class Loop2DArrays {
	public static void main(String[] args) {
		String[][] pizzas = { { "pineapple", "pepperoni" }, //0
				{ "anchovies", "Mushroom", "olives" }, //1
				{ "4 cheese" },//2
				{ "chicken", "tomatoes", "japalenious", "onion" },//3
				{ "green peppers", "zuccini", "brocolli", "spinach", "shrimp" } };//4
		
		//System.out.println(Arrays.deepToString(pizzas[0]));
		for (String[] pizza : pizzas) {
			System.out.println(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}
		System.out.println("=========== FOR LOOP ===========");
		for (int i = 0; i < pizzas.length; i++) {
			System.out.println(pizzas[i].length + "-");
			System.out.println(Arrays.deepToString(pizzas[i]));
		}
		for (String topping : pizzas[0]) {
			System.out.println(topping);
		}
		int[][] students = { {4, 5, 6}, {12, 54, 76}, {23, 56, 12, 55, 3} };
		//2 parts: outer loop, inner loop
		//outer loop will take each group
		//inner loop will take each values/student id
		for (int[] group : students) {
			for (int studentId : group) {
				System.out.print(studentId + ", ");
			}
			System.out.println();
		}
		int [][] nums = { {10, 20}, {20, 30, 40, 50}, {100, 200, 400}, {555, 333, 111, 444, 666, 78} };
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}

}
