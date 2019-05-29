package day42CustomClassesAndEncapsulation;

import java.util.Arrays;

public class Burger7 {
public static void main(String[] args) {
	Burger burger1 = new Burger();
	burger1.name = "Cowboy";
	String[] ings = {"onin crisps", "tomatoes", "chicken", "tomatoes"};
	burger1.ingredients = ings;
	System.out.println(burger1.name);
	System.out.println(Arrays.toString(burger1.ingredients));
	System.out.println(burger1.ingredients[0]);
	
	for (String ing : burger1.ingredients) {
		System.out.println(ing);
	}
}
}
