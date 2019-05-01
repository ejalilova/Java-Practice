package day07_scanner_class;

public class ComparisonOperators {
	public static void main(String[] args) {
	
		//==
		System.out.println(5==5);//true
		System.out.println(50==5);//false
		
		int searchCount = 5000;
		System.out.println(searchCount==5000);//true
		
		int expectedCount = 5010;
		System.out.println(searchCount==expectedCount);//false
		System.out.println(searchCount=expectedCount);//5010

		
		int speedLimit=55;
		int currentSpeed = 75;
		System.out.println(currentSpeed == speedLimit);//false
		
		boolean atLimit = currentSpeed == speedLimit;
		
		System.out.println("At speed limit: "+atLimit);//false
		
		
		
		boolean overlimit = currentSpeed > speedLimit;
		
		System.out.println("Over speed limit: "+ overlimit);//true
		
		boolean underLimit =  currentSpeed < speedLimit;
		
		//boolean underlimit = speedlimit > currentSpeed;
		System.out.println("Under limit: "+underLimit);
		
		double balance=150;
		
		boolean broke = balance <= 0.0;
		System.out.println("Broke? - "+broke);
		
		double transaction = 155.5;
		broke = (balance - transaction)<0;
		
		System.out.println("Will make broke/negative?- "+broke);
		System.out.println("Balance: "+balance);
		System.out.println("Transaction: "+transaction);
				
				
	}
	
}
