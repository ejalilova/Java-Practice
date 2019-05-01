package day16_string_manipulation;

public class CapitalCity {
	public static void main(String[] args) {
		String str = "Moscow is a capital of Russia";
		//Baku, Azerbaijan
		System.out.println(str);
		
		str = str.replace("Moscow", "Baku");
		str = str.replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		//str = str.replace("Moscow", "Baku").str.replace("Russia", "Azerbaijan");
		
		
		String email = "ejalilova@gmail.com";
		
		String company = "deloitte";
		
		String newEmail = email.replace("gmail",  company);
		
		System.out.println(newEmail);
		
		
		
		
		
		 
		
	}

}
