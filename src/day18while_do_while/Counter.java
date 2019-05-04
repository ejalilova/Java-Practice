package day18while_do_while;

public class Counter {
	public static void main(String[] args) throws InterruptedException {
		//1,2,3,4,5,6,7,8,9,10
		
		int num = 1;
		while (num <=10) {
			System.out.print(num+", ");
			num++;
			Thread.sleep(100);//pause the code execution for a second 
			
		}
		System.out.println("\nNum values of loops: "+num);
		//11,10,9,8,7,6,5,4,3,2,1
		int num2 = 11;
		
		while (num2 >=1) {
		System.out.println(num2+",");
		num2--;
		Thread.sleep(50);
		
		
		}
		System.out.println(num2);
		
		
		
		
	}

}
