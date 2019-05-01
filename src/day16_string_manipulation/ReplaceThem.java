package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {

		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ", "");
		
		System.out.println(withNoSpaces);
		
		//replace , with !!!
		System.out.println(sentence);
		sentence = sentence.replace(",", "!!!");
		
		System.out.println(sentence);
		
		String mixed = "&^@#j$a-v|a@#$";
		
		mixed = mixed.replace("&^@#", "");
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
		
		//mixed = mixed.replace("$", "");
		//mixed = mixed.replace("-", "");
		//mixed = mixed.replace("|", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("$", "").replace("-", "").replace("|", "");
		
		System.out.println(mixed);
		
		String result = "About 115,000,000 results (0.59 seconds)";
		
		result = result.replace("About ",  "");
		//result = result.replace(" results (0.59 seconds)", "");
		
		result = result.substring(0, result.indexOf(" "));//start with zero which is 115, until space
		
		System.out.println(result);
		
		result = result.replace("," ,  "");
		System.out.println(result);
		
		
		
		
		
		
		
	}
}
