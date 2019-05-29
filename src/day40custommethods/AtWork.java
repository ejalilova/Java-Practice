package day40custommethods;

public class AtWork {
public static void main(String[] args) {
	Employee2 emp = new Employee2();
	emp.name = "Enya";
	emp.jobTitle = "ScrumMaster";
	emp.salary = 100000;
	
	emp.goToBreak();
	emp.attendMeeting();
	emp.introduce();
	
}
}
