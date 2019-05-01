package Day17stringpool_whileloop;

public class WhileLoop1 {
	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 140;

		while (n2 > n1) {
			System.out.println("N2 is greater");
		}

		System.out.println("END");
	}
		//the above loop is infinite loop. condition will always be true, never becomes false
		//while loop keeps execution as long as the condition stays true
}
