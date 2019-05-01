package day13_ternary_strings_intro;
import java.util.*;
public class CarSelector {
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please select car you would like to purchase:");
		System.out.println("1) American\n2) Japanese\n3) German\n4) Itallian\n5) Korean");
		
		int carType =input.nextInt();
		double averagePrice = 0.0;
		String carOptions = "";
		String carOrigin = "";
				
		switch (carType) { 
		case 1: 
			averagePrice = 33000.0;
			carOptions = "ford dodge tesla chevrolet lincoln";
			carOrigin = "American";
			break;
		case 2: 
			averagePrice = 32000.0;
			carOptions = "japanese toyota mitsubisi honda subaru mazda";
			carOrigin = "Japanese";
			break;
		case 3: 
			averagePrice = 55000.0;
			carOptions = "bmw audi mercedes porche";
			carOrigin = "German";
			break;
		case 4: 
			averagePrice = 76000.0;
			carOptions = "alfa romeo, ferrari lamborghini, fiat";
			carOrigin = "Itallian";
			break;
		case 5: 
			averagePrice = 2000.0;
			carOptions = "kia, hyundai, daewoo";
			carOrigin = "Korean";
			break;
			
			default:
				System.out.println("Not vailable");
			return;// stop execution
			
		}
		System.out.println("you selected "+carOrigin+(" car and your options are: ")+carOptions+("."));
		System.out.println("Average price: "+averagePrice);
	}
	
	

}


