package day40custommethods;

public class Employee2 {
	String name;
	String jobTitle;
	int salary;
	


public void goToBreak() {
	System.out.println("Going to break");
}
public void attendMeeting () {
	System.out.println("Attending meeting");
}
public void introduce() {
	System.out.println("Introducing "+name+"job title "+jobTitle+" salary "+salary);
}
}