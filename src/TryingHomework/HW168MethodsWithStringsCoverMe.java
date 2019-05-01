package TryingHomework;

public class HW168MethodsWithStringsCoverMe {
public static void main(String[] args) {
	  System.out.println(coverString("apples", "pears") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
	    
	    if (main.contains(coverME)) {
	      return main.replace(coverME, ("[" + coverME + "]"));
	    } else {
	      return main.replace(main, "[" + main + "]");
	    }
	  }
	  
	}