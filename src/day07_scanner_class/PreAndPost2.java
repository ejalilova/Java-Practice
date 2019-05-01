package day07_scanner_class;

public class PreAndPost2 {
	public static void main(String[] args) {
		int num = 0;
		int num2 = num++;
		
		System.out.println("num: "+num);//
		System.out.println("num2 "+num2);
		
		int n= 0;
		int n2=++n;
		
		
		System.out.println("n: "+n);//1
		System.out.println("n2: "+n2);//1
		
		int i =10;
		i++;
		++i;
		System.out.println("I value: "+i);
		
		int bananas = 6;//8
		int pears = bananas++;//6
		int apples = ++bananas;//8
		
		System.out.println(bananas);
		System.out.println(pears);
		System.out.println(apples);
		
		int friends = 10;
		System.out.println(friends++);//11
		System.out.println(friends);//11
		
		int p1=10;
		int sum=p1++ +5;//16
		System.out.println("sum: "+sum);//16
		System.out.println("p1: "+p1);//11
		
		int bat= 8;
		int totalBat=bat++ + ++bat;//
		System.out.println("totalBat: "+totalBat);//
		System.out.println("bat: "+bat);//10
		
		int bat2= 8;
		int oldBat=5;
		int totalBat2=bat2++ + ++oldBat;
		System.out.println("bat2: "+bat2);//9
		System.out.println("oldBat: "+oldBat);//6
		System.out.println("totalBat2: "+totalBat2);//14
		
		
		
		
		
		
	}
	

}
