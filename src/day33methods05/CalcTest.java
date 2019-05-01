package day33methods05;

public class CalcTest {
	public static void main(String[] args) {
		System.out.println(Calculator.add(3, 1));
		System.out.println(Calculator.multiply(5, 6));
		System.out.println(Calculator.minus(40, 12));
		System.out.println(Calculator.divide(100, 2));
		
		int addResult = Calculator.add(21, 41);
		double mResult = Calculator.multiply(50, 40);
		double miResilt = Calculator.minus(3000, 200);
		double dResult = Calculator.divide(455, 5);
		
		System.out.println("Add " + addResult);
		System.out.println("Multiply " + mResult);
		System.out.println(mResult);
		System.out.println(dResult);
		
		double a = 10.0, b = 5.0;
		double myResult = Calculator.minus(a, b);
		System.out.println("my result: " + myResult);
		
		double[] dNums = {2.0, 4.0};
		double result2 = Calculator.multiply(dNums[0], dNums[1]);
		System.out.println("Array result: " + result2);
		
		if (Calculator.add(10,  16) == 26) {
			System.out.println("Unit test passed");
		} else {
			System.out.println("Add unit test failed");
		}
		String str = "java";
		if (str.length() == 4) {
			System.out.println("it is 4 characters");
		} else {
			System.out.println("It is not 4 characters");
		}
	}
}








