package day04_primitives_operators;

public class CitiesTogether {
	

	//declare 3 String variables
	//City1
	//City2
	//City3
	
	//Assign values:
	
	//Tashkent, Kyiv, Moscow
	//print from tashkent to Kyiv is $500
	//print from moscow to tashkent is 550
	// i have been to Tashkent, Moscow, Kyiv.
	
	public static void main (String[] args) {
		
		String city1 = "Tashkent";
		String city2 = "Moscow";
		String city3 = "Kyiv";
		
		System.out.println("From " +city1+ " to " +city2+ " is $500");
		System.out.println("From " + city1+ " to " +city1+ " is 550");
		System.out.println("I have been to "+city1+", "+city2+", "+city3+".");
		
       String app = "WhatsUp" + " and slack";
       //We use <Slack> for messaging with classmates.
       
       System.out.println("We use "+app+" for messaging with classmates");
       
       String num = "12 + 1";
       System.out.println(num);
       
	}
	
        
	

}
