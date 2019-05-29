package day50_inheritance03;

public class Company {
public static void main(String[] args) {
	Employee emp = new Employee();
	FullTimeEmployee full = new FullTimeEmployee();
	Contructor cont = new Contructor();
	
	emp.calculatePay(40,  40);
	full.calculatePay(40, 45);
	cont.calculatePay(40, 55);
}
}
