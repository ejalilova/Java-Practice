package day37ArrayList;

import java.util.ArrayList;

public class Shopping {
	public static void main(String[] args) {
		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("fruits");
		shoppingList.add("veggies");
		shoppingList.add("oil"); 
		shoppingList.add("chocolate");
		shoppingList.add("oatmeal");
		shoppingList.add("fish");
		int count = shoppingList.size();
		System.out.println("Total count: " + count);
		System.out.println("Just shopping list" + shoppingList);
		System.out.println("Shopping list to String " + shoppingList.toString());
		System.out.println(shoppingList.get(0) + " | " + shoppingList.get(count - 1));
		shoppingList.remove(5);
		shoppingList.remove("oil");
		System.out.println(shoppingList);
		for (String item : shoppingList) {
			System.out.println(item);
		}
		shoppingList.clear();
		System.out.println(shoppingList);
	}

}
