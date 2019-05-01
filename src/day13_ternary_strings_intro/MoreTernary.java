package day13_ternary_strings_intro;

public class MoreTernary {
	public static void main(String[] args) {
		String quality = "good";
		int rating = quality.equals("good") ? 100 : 0;
		
		System.out.println("Rating: " + rating);
		System.out.println();
		
		
		int PMhour = 6;
		//rush hour during evening: 4 - 7
		boolean rushHour = (PMhour >= 4 && PMhour<=7) ? true : false;
		//System.out.println(PMhour + " is rush hour?");
		
		String result = rushHour == true ? "yes" : "no";
				
		//String result = rushHour ?
		
		System.out.println(PMhour + " is rush hour?" + result);
		
		int AMHour = 8; //6-9
		
		String amRushHour = AMHour >= 6 && AMHour <=9 ? "yes" : "no";
		
		System.out.println(AMHour + " is rush hour? - " + amRushHour);
		
		
		
	}
}

