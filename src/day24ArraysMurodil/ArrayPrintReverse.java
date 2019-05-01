package day24ArraysMurodil;

public class ArrayPrintReverse {
	public static void main(String[] args) {
		int[] points = {7, 9, 2, 4, 6, 34, 12, 10, 5};
		if (points.length == 10) {
			System.out.println("10 points found");
		} else {
			System.out.println("need 10 points");
		}
		for (int i = points.length-1; i >= 0; i--) {
			System.out.print(points[i] + " ");
		}
		
		System.out.println("\n===== WHILE LOOP ========");
		
		int idx = points.length - 1;
		
		while (idx >= 0) {
			System.out.print(points[idx] + " ");
			idx--;
		}
	}

}
