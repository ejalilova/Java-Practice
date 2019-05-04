package day16_string_manipulation;

import java.util.Scanner;

public class Url {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter URL");
		String url = scan.next();

		// www.amazon.com
		// com, net, edu, org, gov
		// check if it starts with www.
		// assign String domain name (amazon) and String extension
		// print them "Domain is:
		
		// "extension is:
		// String word1 = "eclipse"; 
		// startsWith - tests if string starts with another string
		// System.out.println(word1.startsWith("e"));

		if (url.startsWith("www")) {
			System.out.println("www. is present");
		} else {
			System.out.println("invalid url format");
			return;
		}
		// check if contains the ending dot, right before the extension
		// find out the length of the url //do -4 and using charAt get the character
		// //compare if it is "."
		int dotIndex = url.length() - 4;
		// url.lastIndexOf(".");

		if (url.charAt(dotIndex) == '.') {
			System.out.println(". is there before extention");
		} else {
			System.out.println(". might be missplaced");
		}
		// if(url.charAt(url.length() - 4 ) == '.'){ }
		String domain = url.substring(4, dotIndex);
		System.out.println("Domain: "+domain);
		String extension = url.substring(dotIndex + 1, url.length());
		//System.out.println("extension");
		
		System.out.println("Extension: "+extension);
		

		
		
	}
}