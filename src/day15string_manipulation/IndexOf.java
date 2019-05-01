package day15string_manipulation;

public class IndexOf {
	public static void main(String[] args) {
		String word1 = "github";
		System.out.println(word1.indexOf('g')); //can use char or double quotes as string
		System.out.println(word1.indexOf("th")); // index 2
		System.out.println(word1.indexOf("hub")); // index 3
		System.out.println(word1.indexOf("java"));
		
		
		String url = "www.okta.com";
		int index = url.indexOf(".");
		System.out.println("Position of . : "+index);
		System.out.println(url.charAt(index+1));
		
		String title = "Java - Google Search";
		//find position of '-' and check if space is on right and left sides
		
		int index2 = title.indexOf("-");//5
		System.out.println(index2);
		
		//System.out.println("Position of '-'" + index2);
		System.out.println(title.charAt(index2 - 1));
		System.out.println(title.charAt(index2 + 1));
		
		String country = "United States of America";
		int states = country.indexOf("States"); //7
		System.out.println("Position of States: " + states);
		
		String word2 = "java, c++, python, tomcat, eclipse";
		//check if c++ is in the word2
		// 1 using contains
		if (word2.contains("c++")) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");
		}
		//2 using indexOf
		if (word2.indexOf("c++") > -1) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
