package TryingHomework;

public class HW194 {
public static void main(String[] args) {
	System.out.println(isPalindrome("I am not palindrome"));
}

	public static boolean isPalindrome(String check) {
		  String polindrome = "";
		    for (int i = check.length()-1; i >= 0; i--) {
		      
		      polindrome += check.charAt(i);
		      
		      //polindrome += i;
		    }
		    
		    if (polindrome.trim().equalsIgnoreCase(check)) {
		  // if (polindrome.equals(check)) {
		      return true;
		    } else {
		      return false;
		    }
		  }
		}