package day28MultiDArray;

import java.util.Arrays;

public class ReverseSentence {
	public static void main(String[] args) {
		//1) reversing sentence
		//create a String variable sentence and assign value
		//find out and print number of words
		//reverse the sentence and assign to new string called reversed
		//print the reversed
		/*
		 * for (int idx = itemsId.length - 1; idx >= 0; idx--) {
			System.out.println(itemsId[idx]);
		}
		 */
		String sentence = "you are very interesting person";
		String[] splitedSentence = sentence.split(" ");
		//String reversed = 
		System.out.println(splitedSentence.length);
		System.out.println(Arrays.deepToString(splitedSentence));
		
		String reversed = "";
		for (int i = splitedSentence.length - 1; i >= 0; i--) {
			//System.out.println(splitedSentence[i]);
			reversed += splitedSentence[i] + " ";
		}
		reversed = reversed.trim(); // will remove extra space at the end
		System.out.println(reversed);
	}

}
