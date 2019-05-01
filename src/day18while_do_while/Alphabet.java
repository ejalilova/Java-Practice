package day18while_do_while;

public class Alphabet {
public static void main(String[] args) {
	char letter = 'a';
	//System.out.println(letter);
	//letter++;
	//System.out.println(letter);
	//letter++;
	
	while (letter <= 'z') {
		System.out.print(letter + " ");
		letter++;
		
	}
	System.out.println();//new line
	
	char capitals = 'A';
	
	while(capitals <= 'Z') {
		System.out.print(capitals + " ");
		capitals++;
		
	}
	//print lower case in reverse
	System.out.println();
	
	char reverse = 'z';
	while(reverse >= 'a') {
	System.out.print(reverse + " ");
	reverse--;
	
}
	// A AB ABC ABCD
	System.out.println();
	
	String letters = "";
	char myLetter = 'A';
	
	while (myLetter <= 'Z') {
		letters = letters + myLetter;
		System.out.println(letters);
		myLetter++;
	}
		
		
	//letters = letters + 'A';
	//System.out.println(letters);
	
	//letters = letters + 'B';
	//System.out.println(letters);		
			
	//letters = letters + 'C';
	//System.out.println(letters);		
	
	//1 with a counter
	String stairs = "*";
	int num = 1;
	while (num <= 10) {
		System.out.println(stairs);
		stairs += "*";
		num++;
			
	}
	//2 checking length()
	stairs = "*";
	while(stairs.length() <= 10) {
		System.out.println(stairs);
		stairs += "*";
		// do backwards
		
	}
		
}
}