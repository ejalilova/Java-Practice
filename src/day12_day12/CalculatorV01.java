package day12_day12;
import java.util.*;
public class CalculatorV01 {
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
	
	
	
	if (operator.equals("+")) {
		result = num1 + num2;
	}else if(operator.equals("-")) {
		result= num1-num2;
	}else if(operator.equals("*")) {
		result = num1 * num2;
	}else if(operator.equals("/")) {
		result = num1 / num2;
	}else if(operator.equals("%")) {
		result = num1 % num2;
	}else {
		System.out.println("Invalid operator selected: "+ operator);
	return;
	}
		
	System.out.println("Result: "+result);
	}
	
	
	
	}

