package day51_ineritance04;

public class Snowbording extends Exercise {
	public int perform(int minutes) {
		int cals = super.perform(10);//call super class version of perform
		System.out.println("Snowboring for " + minutes + " minutes");
		return minutes * 7 + cals;
	}
}
