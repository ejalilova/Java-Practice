package day07_scanner_class;

public class PreAndPost {
	public static void main(String[] args) {
		int num=0;
		int num2 = num++;
		
		System.out.println("num: "+num);//1
		System.out.println("num2 "+num2);//0
		
		
		int n = 0;
		int n2 = ++n;
		
		
		System.out.println("n: "+n);//1
		System.out.println("n2: "+n2);//1
		
		
	
		int bananas = 6;
		int pears = bananas++;
		int apples = ++bananas;
		
		System.out.println("bananas: "+ bananas);//8
		System.out.println("pears: "+ pears);//6
		System.out.println("apples: "+ apples);//8
		
		
		
	}

}
