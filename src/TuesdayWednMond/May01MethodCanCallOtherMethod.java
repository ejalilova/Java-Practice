package TuesdayWednMond;

public class May01MethodCanCallOtherMethod {
public static void main(String[] args) {
	System.out.println(milesToKms(10));
	double km = milesToKms(70);
	System.out.println(multiply(4, 8));
	System.out.println(galonToLiters(5));
}
public static double milesToKms(double miles) {
	//double kmValue = miles * 1.609;
	double kmValue = multiply(miles, 1.609);
	return kmValue;
}
public static double multiply(double num1, double num2) {
	return num1 * num2;
}
public static double galonToLiters(double gallon) {
	double literValue = multiply(gallon, 3.785);
		return literValue;
	
}

}
