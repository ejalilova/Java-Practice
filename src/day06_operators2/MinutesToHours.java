package day06_operators2;

public class MinutesToHours {
	public static void main(String[] args) {
		//declare an int variable minutes
		//and remaining
		//print 5 hours and 10 minutes
		//minutes 125
		//2hours 5 minutes
		
		int minutes=125;
		
		int hours= minutes / 60;
		int remainingMinutes = minutes % 60;
		System.out.println(hours);
		System.out.println(remainingMinutes);
		System.out.print(minutes+" minutes is ");
		System.out.println(hours+" hours and "+remainingMinutes+ " minutes");
		
		
		
	}

}
