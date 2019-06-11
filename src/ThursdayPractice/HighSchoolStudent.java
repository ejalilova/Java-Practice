package ThursdayPractice;

public class HighSchoolStudent extends Student{
	
	HighSchoolStudent(String school){
		super(school);
	}
	public String toString() {
		return "high school " + super.toString();
	}
}
