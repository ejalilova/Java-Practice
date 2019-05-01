package day12_day12;
import java.util.*;

public class Weather {
	public static void main(String[] args) {
		
		
	Scanner input = new Scanner(System.in);	
	
	System.out.println("How is the weather today?");
	
	String weather = input.next().toLowerCase();
	
	switch (weather) {
	case "sunny":
		System.out.println("Go to Park");
		System.out.println("Code Java");
	break;
	}
	switch (weather) {
	case "hot":
		System.out.println("Go swimming");
		System.out.println("Code Java");
	break;
	}
	switch (weather) {
	case "windy":
		System.out.println("Fly a kite");
		System.out.println("Code Java");
	break;
	}
	switch (weather) {
	case "rainy":
		System.out.println("Go shopping");
		System.out.println("Code Java");
	break;
	}
	switch (weather) {
	case "sunny":
		System.out.println("Change your tires");
		System.out.println("Go skiing");
		System.out.println("Code Java");
	break;
	
	default:
    System.out.println("Code Java in any other weather");
			
	System.out.println("END OF PROGRAMM");
	
	}
	}
	}