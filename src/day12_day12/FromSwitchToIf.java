package day12_day12;

import java.util.Scanner;

public class FromSwitchToIf {

	public static void main(String[] args) {
		//enter first number 5, enter second number 6, select Operation: +, -,*,/,% - +
		//result : 11
		//if non true invalid situation
	Scanner input = new Scanner(System.in);	
		
	System.out.println("Enter first number: ");
	double num1 = input.nextDouble();
	
	System.out.println("Enter second number: ");
	double num2 = input.nextDouble();

	System.out.println("Select Operator: +, -, *, /, %");
	
	String operator = input.next();
	
	double result = 0.0;
	
	System.out.println("Result:");
	
	switch (operator) {
	
	case "+":
	System.out.println(result = num1 + num2);
	break;
	
	case ("-"):
	System.out.println(result= num1-num2);
	break;
	
	case ("*"):
	System.out.println(num1 * num2);
	break;
	
	case ("/"):
	System.out.println(result = num1 / num2);
	break;
	
	case ("%"):
	System.out.println("num1 % num2");
	break;
	
	}
	}
	

}
