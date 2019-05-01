package day05_math_operators;

public class CompanyWarmUp {
	public static void main(String[] args) {
		//company Facebook
		//address "Silicon Valley, CA"
		//nuber of employees 10000
		//revenue 4 000 000
		//is tech company yes
		
		String companyName = "Facebook";
		String address ="Silicon Valley, CA";
		int numberOfEmployees = 1000;
		long revenue = 400076760L;
		boolean isTechCompany = true;
		
		System.out.println("Company name is "+companyName);
		System.out.println("Address is " + address);
		System.out.println("Number of employees is " +numberOfEmployees);
		System.out.println("Annual revenue is " +revenue);
		System.out.println("IS it a tech company? -  " +isTechCompany);

				
		//create a String variable about company and describe the company and assign as a value
		//print value of about company variable
		//"Company Facebook is located in Silicon VAlley, CA and 10000 ppl for it. Its revenue is 55 and it is a tech company-true."
		
		System.out.println();
		String aboutCompany = "Company "+companyName+" is located in "+address + "\n \t and "+numberOfEmployees + " work for it.";
		System.out.println(aboutCompany);
		
		
		String s = "123 + 1";
		System.out.println(s);
		
		String str="";
		int num1=10;
		int num2=20;
		System.out.println(num1+" "+num2);
		System.out.println(num1+str+num2);

		
	}
	

}
