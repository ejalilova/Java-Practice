package TryingHomework;

import java.util.Scanner;

public class ParseHTML {
	/*
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();

		int startIndex = html.indexOf("id=\"");

		if (startIndex != -1) {
			startIndex += 4;
			int endIndex = html.substring(startIndex).indexOf("\"");

			System.out.println(html.substring(startIndex, startIndex + endIndex));

		} else {
			System.out.println("Invalid input!");
		}

		// String sender = message.substring(message.indexOf("<") + 1,
		// message.indexOf(">"));
	}
	//*/
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String html = scan.nextLine();
		  int start = html.indexOf("id=\"");
		    if (start == -1) {
		    	System.out.println("Invalid input!");
		    } else {
		  String new2 = html.substring(html.indexOf("id=\"")+4, html.lastIndexOf("\""));
		  // (html.contains(new2)) {
		    System.out.println(new2);
		  
		   
		  }
	  }
	  }

		//String sender = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
		

