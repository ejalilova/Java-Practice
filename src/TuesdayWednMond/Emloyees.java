package TuesdayWednMond;

public class Emloyees {
public static void main(String[] args) {
	
	EmailGenerator.companyName = "Deloitte";
	
	EmailGenerator e1 = new EmailGenerator("Roman");
	System.out.println(e1.getEmail());
	
	EmailGenerator e2 = new EmailGenerator("Florian");
	System.out.println(e2.getEmail());
	
	EmailGenerator.companyName = "Shmeloit";
	
	System.out.println(e1.getEmail());
	System.out.println(e2.getEmail());
	
	e1.name = "John";
	
	System.out.println(e1.getEmail());
	System.out.println(e2.getEmail());
}
}
