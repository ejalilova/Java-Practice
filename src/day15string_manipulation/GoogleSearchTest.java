package day15string_manipulation;

public class GoogleSearchTest {
	public static void main(String[] args) {
		String item = "Java";
		String pageTitle = item + " - Google Search";
		
		//test if pageTitle starts with item?
		
		if (pageTitle.startsWith(item)) {
			System.out.println("Page title check passed");
		} else {
			System.out.println("FAILED");
		}
		
		if(pageTitle.endsWith("Google Search")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		
		
		
		
	}

}
