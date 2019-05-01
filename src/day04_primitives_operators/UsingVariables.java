package day04_primitives_operators;

public class UsingVariables {
	public static void main(String[] args) {
		//Declare num1, num2, num3
		
		int num1,num2,num3;
		
		//assign 100 to num1
		//assign values of num1 to num2
		//Print num1, num2 values is separate lines
		
		
		num1=100;
		num2=num1;
		System.out.println(num1);
		System.out.println(num2);
				
				num2=200;
				num1=num2;
				num3=num1;
				
		
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);
				
				num2=200;
				num3=num1;
				num1=num2;
				
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);
				
				//declare apples and assign 25
				//declare kiwis and assign values of apples to it
				//declare mangoes and 55
				//assign mangoes to kiwis
				
				int apples = 25;
				int kiwis = apples;
				int mangoes = 55;
				kiwis = mangoes;
				
				System.out.println(apples); //25
				System.out.println(kiwis); //55
				System.out.println(mangoes); //55
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
			
		
	}

}
