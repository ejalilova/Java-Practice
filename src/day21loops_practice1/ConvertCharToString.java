package day21loops_practice1;

public class ConvertCharToString {
	public static void main(String[] args) {
		
		char ch = 'a';
		String str1 = ""+ch; //char to a string - easiest way
		System.out.println(str1);
		
		char ch2 = 'v';
		//String str2 = new String(ch2); - NO
		String str2 = new String(""+ch2); 
		String str3 = Character.toString(ch2);
		
		System.out.println(str2);
		System.out.println(str3);
	}

}
