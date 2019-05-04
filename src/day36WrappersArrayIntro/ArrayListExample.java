package day36WrappersArrayIntro;
import java.util.ArrayList;
public class ArrayListExample {
public static void main(String[] args) {
	ArrayList<String> languages = new ArrayList<>();
	languages.add("Java");
	languages.add("English");
	languages.add("Spanish");
	languages.add("Arabic");
	languages.add("Russian");
	languages.add("French");
	
	System.out.println("Number of values: " + languages.size());
	System.out.println(languages.get(1));
	
	//remove java
	languages.remove(0);
	//languages.remove("Spanish");
	System.out.println("Number of values: " + languages.size());
	
	System.out.println(languages.toString());
}
}

