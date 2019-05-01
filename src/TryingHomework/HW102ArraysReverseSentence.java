package TryingHomework;

import java.util.Scanner;

public class HW102ArraysReverseSentence {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    //TODO: Type your code below
   int counter =0;
   String[] words = sentence.split(" ");
    for(String str : words) {
      System.out.println(str);
      
    }
  



/*int counter = 0;
String sentence = "Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.";
String[] words = sentence.split(" ");
for (String str : words) {
System.out.println(str);
*/
//  for(int i = sentence.length -1; i > 0; i --) { 
//System.out.println(sentence[i]);

//}
}
}
