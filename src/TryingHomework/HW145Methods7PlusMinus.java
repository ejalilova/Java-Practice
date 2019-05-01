package TryingHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HW145Methods7PlusMinus {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i <= size - 1; i++) {
			arr[i] = inp.nextInt();
		}

		plus_minus(arr);
	}// end main

	public static void plus_minus(int arr[]) {
		int positives = 0;//6
		int negatives = 0;
		int zeros = 0;//0
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println("i="+i+" arr[i]="+arr[i]);
			//1 0 5
			if (arr[i] > 0) {
				positives++; // = positives + arr[i];
			} else if (arr[i] < 0) {
				negatives++; //+= arr[i];
			} else {
				zeros++; //= zeros + arr[i];
			}

		}
		//System.out.println(String.format("positives:%d, negatives:%d, zeros:%d", positives,negatives,zeros));
		System.out.println("positives:" + positives + ", negatives:" + negatives + ", zeros:" + zeros);
	}
}
