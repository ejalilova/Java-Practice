package day52_inheritance05;

import java.util.*;

public class FinalArrayList {
	
	final static public String COLOR = "Pink";
	//public - access modifier
	//final, static - non-access modifier
	
	public static void main(String[] args) {
		
		final ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("Orange");
		COLORS.add("Grey");
		COLORS.add("White");
		COLORS.add("Blue");
		
		System.out.println(COLORS.toString());
		COLORS.add("Yellow");
		System.out.println(COLORS.toString());
		
		//COLORS = new ArrayList<>();//new Object
		//System.out.println(COLORS.toString());
		//COLORS.add("Yellow");		
		
	}
}
