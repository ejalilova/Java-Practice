package day31Methods;
import java.util.*;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		add(5.5, 6.7);
		substract(6, 3);
		multiply(7, 8);
		divide(8, 4.5);
		remainder(9, 2);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operation: '+', '-', '*', '/', '%'");
		String operator = scan.next();
		
		switch (operator) {
		case ("+"):
			add(n1,n2);
		break;
		case ("-"):
			substract(n1,n2);
		break;
		case ("/"):
			divide(n1,n2);
		break;
		case ("*"):
			multiply(n1,n2);
		break;
		case ("%"):
			remainder(n1,n2);
		break;
		default:
			System.out.println("Invalid operator");
	}
	}

	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Result: " + result);
	}

	public static void substract(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("Result: " + result);
	}

	public static void multiply(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("Result: " + result);
	}

	public static void divide(double num1, double num2) {
		double result = num1 / num2;
		System.out.println("Result: " + result);
	}

	public static void remainder(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Cannot devide by 0");
			return; // exit method
		}
		double result = num1 % num2;
		System.out.println("Result: " + result);

	}
}
