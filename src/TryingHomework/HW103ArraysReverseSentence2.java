package TryingHomework;

import java.util.Arrays;
import java.util.Scanner;

public class HW103ArraysReverseSentence2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";
		// TODO: start your code here
		String[] splited = sentence.split(" ");
		for(int i = splited.length -1; i >=0; i--){
		  reversed +=splited[i] + " ";
		}
		// End your code here. do not modify below statement
		System.out.println(reversed);
	}
}
/*String sentence = "you are very interesting person";
		String[] splitedSentence = sentence.split(" ");
		String reversed = "";
		for (int i = splitedSentence.length - 1; i >= 0; i--) {
			//System.out.println(splitedSentence[i]);
			reversed += splitedSentence[i] + " ";
		}
		reversed = reversed.trim(); // will remove extra space at the end
		System.out.println(reversed);
	}

}
 */

