package day45Practice;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
public static void main(String[] args) {
	
	Course course1 = new Course();
	
	course1.setName("Java programming");
	
	List<String> teachers = new ArrayList<>();
	
	teachers.add("Vasyl");
	teachers.add("Murodil");
	teachers.add("Marufjon");
	teachers.add("Muhtar");
	
	course1.setTeachers(teachers);
	System.out.println(course1.toString());
	
	List<String> students = new ArrayList<>();
	students.add("Burak");
	students.add("Roman");
	students.add("Gulnar");
	students.add("Ethem");
	students.add("Sung");
	
	course1.setStudents(students);
	System.out.println(course1.toString());
	
	course1.addTeacher("Maria");
	course1.addStudent("Kate");
	
	if (course1.getTeachers().contains("Maria")) {
		System.out.println("Maria is a teacher");
	} else {
		System.out.println("Maria is not a teacher");
	}
	if (course1.getStudents().contains("Kate")) {
		System.out.println("Kate is there");
	} else {
		System.out.println("Kate is not there");
	}
	
	course1.removeTeacher("Murodil");
	course1.removeStudent("Roman");
	
	if (!course1.getTeachers().contains("Murodil")) {
		System.out.println("Murodil is removed");
	} else {
		System.out.println("Murodil is not removed");
	}
	if (!course1.getStudents().contains("Roman")) {
		System.out.println("Roman is removed");
	} else {
		System.out.println("Roman is not removed");
	}
}
}

