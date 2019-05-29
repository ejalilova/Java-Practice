package day51_ineritance04;

public class Swimming extends Exercise {
	public int perform (int minutes) {
		System.out.println("Swimming");
		return minutes * 11;
	}
}
