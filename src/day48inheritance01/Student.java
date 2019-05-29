package day48inheritance01;

public class Student extends Person {
	 
	int studentId;
	String clazz;
	
	public void code(String lang) {
		System.out.println(name + " is coding " + lang);
	}
	public void attendClasses() {
		System.out.println(name + " is attending " + clazz + " class");
	}
}
