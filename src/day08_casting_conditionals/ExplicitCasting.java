package day08_casting_conditionals;

public class ExplicitCasting {
	public static void main(String[] args) {
		System.out.println(10/2.0);//result is double
		System.out.println(10.0/2);
		
		int result = (int) (10/2.0);
		System.out.println(result);
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		double average = (rent1+rent2+rent3+rent4)/4;
		System.out.println(average);
		
		double average2 = (rent1+rent2+rent3+rent4)/(double)4; //either double or add 4.0
		System.out.println(average2);
		
		double average3 = (double)(rent1+rent2+rent3+rent4)/4;
		System.out.println(average3);
		
		double d = 40.2;
		int i = (byte)d;
		System.out.println(d);
		System.out.println(i);
		//in above statement both explicit and implicit casting happening.
		//explicit: double > byte,
		//implicit: byte > int
		
		
		
	}
	

}
