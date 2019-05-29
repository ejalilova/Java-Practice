package day40custommethods;

public class Employee {
	public String name;
	public String jobTitle;
	public double salary;



	public void work() {
		System.out.println(name + " is working hard");
	}

	public void attendMeeting() {
		System.out.println(name + " is attending meeting");

}
	public void introduce() {
		System.out.println("Name[" + name +"], jobTitle[" + jobTitle 
				+"], salary[" + salary + "]");
	}
	}
//"Name[name], jobTitle[jobTitle], salary[salary]"