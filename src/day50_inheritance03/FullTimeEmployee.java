package day50_inheritance03;

public class FullTimeEmployee extends Employee {

	public void calculatePay(int hours, double rate) {
		//@Override
		double total = (hours * rate) * 1.05;
		System.out.println("FullTimeEmployee total pay: " + total);

	}
}
