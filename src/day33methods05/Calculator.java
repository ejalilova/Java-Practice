package day33methods05;

public class Calculator {
	public static void main(String[] args) {
		addVoid(5, 9);
		
		int result = add(4, 8);
		System.out.println("Result: " + result);
		double resultMultiply = multiply(2, 5);
		System.out.println("Multiply: " + resultMultiply);
		double resultDivide = divide(8, 4);
		System.out.println("Divide: " + resultDivide);
		double resultMinus = minus(77, 7);
		System.out.println(resultMinus);
	}

	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
		//return num1 + num2; 
	}
	public static double multiply(double num1, double num2) {
		double sum = num1 * num2;
		return sum;
	}
	public static double divide(double num1, double num2) {
		if (num2 ==0) {
			System.out.println("ERROR: Cannot / by 0");
			return 0;
		} else {
		double sum = num1 / num2;
		return sum;
		}
	}
	public static double minus(double num1, double num2) {
		double sum = num1 - num2;
		return sum;
	}
}


