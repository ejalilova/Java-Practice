package day38ArrayList03;
import java.util.*;
public class EqualsMethod {
	public static void main(String[] args) {
		List<String> friends1 = new ArrayList<>();
		List<String> friends2 = new ArrayList<>();
		
		friends1.add("Roman");
		friends1.add("Natalia");
		friends1.add("Elizabeth");
		friends1.add("Orhan");
		
		friends2.add("Roman");
		friends2.add("Natalia");
		friends2.add("Elizabeth");
		friends2.add("Orhan");
		
		System.out.println(friends1);
		System.out.println(friends2);
		
		if (friends1.equals(friends2)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not equal");
		}
	}

}
