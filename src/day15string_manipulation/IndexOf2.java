package day15string_manipulation;

public class IndexOf2 {
	public static void main(String[] args) {
		//index 0f with 2 inputs
		String list = "html-selenium-angular-jenkins-grid-cucumber";
		
		int firstDash = list.indexOf("-");
		System.out.println("First dash: " + firstDash); //4
		
		int secondDash = list.indexOf("-", 5);// look for - but start search from index 5
		System.out.println("Secon dash: " + secondDash);
		
		int thirdDash = list.indexOf("-", secondDash + 1);
		System.out.println("Third dash: " + thirdDash);
		
		//find the last dash
		
		int lastDash = list.lastIndexOf(("-"));
		System.out.println("Last dash: " + lastDash);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
