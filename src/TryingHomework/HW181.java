package TryingHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public class HW181 {
	public static void main(String[] args) {
		
		String test = "who#am#I";
		String.spl
		
		combineRs( new String[] {"f","o","o"}, new String[] {"b", "a", "r"} );
		}

	public static String combineRs(String[] r1, String[] r2) {
		List<String> results = new ArrayList<>();

		results.addAll(Arrays.asList(r1));
		results.addAll(Arrays.asList(r2));
		//results.toArray(new String[0]);
		return String.join("", results);
//System.out.println(cities.toString());
	}
}