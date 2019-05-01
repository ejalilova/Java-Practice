package day09_stringequals_conditionals;
	import java.util.Scanner;
public class Canada {
public static void main(String[] args) {
	
	//ask user "What is the capital of Canada?"
	//using scanner assign the value to capital variable
	//check if the answer is correct
	//if correct "Your answer is correct!"
	//if false "Your answer is incorrect! value is not capital of Canada"
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("What is the capital of Canada?");
	
	String capital = keyboard.nextLine();
	
	
	
	//check if the answer is correct
	//(capital.equalsIgnoreCase(Otawwa)
	if(capital.equals("Ottawa")) {
		System.out.println("Your answer is correct!");
		
	}else{
		System.out.println("Your answer is incorrect! "+capital+" is not capital of Canada");
		
	
				
	}
	
	
	
}
}
