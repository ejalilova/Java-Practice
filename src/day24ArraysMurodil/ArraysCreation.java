package day24ArraysMurodil;

public class ArraysCreation {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 3;
		numbers[1] = 5;
		numbers[2] = 7;
		numbers[3] = 8;
		numbers[4] = 9;
//read from array
		System.out.println(numbers[0]);
		System.out.println(numbers[3]);
		
	numbers[1] = numbers[2] + numbers[3];
	System.out.println(numbers[1]);
//declare char array grades and assign grades
//char[] grades = new char[5];
char[] grades = {'A', 'B', 'C', 'D', 'E'};
char[] grades2 = new char[]{'A', 'B', 'C', 'D', 'E'};

System.out.println(grades[0]);
char myGrade = grades[1];
System.out.println(myGrade);

char[] grades3 = new char[5];
grades3[0] = 'A';
grades3[1] = 'B';
grades3[2] = 'C';
grades3[3] = 'D';
grades3[4] = 'E';

//String[] cities = new String[3];
//or:
String[] cities;
cities = new String[3];

cities[0] = "Washington";
cities[1] = "Los Angeles";
cities[2] = "New York";



	}

}
