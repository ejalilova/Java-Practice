package day13_ternary_strings_intro;

public class Ternery {
	public static void main(String[] args) {
		
		//if (score > 60) {
			//result = "pass";
		//}else {
			//result = "fail";
		
		String result;
		
		int score = 90;
		
		result = score > 60 ? "pass" : "fail";
		
		System.out.println("Result is: "+result);
		
	}

}

