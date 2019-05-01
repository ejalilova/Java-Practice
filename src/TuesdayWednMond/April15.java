package TuesdayWednMond;

public class April15 {
	public static void main(String[] args) {
		String day = "Monday";
		System.out.println(day.length());
		if (day.length() >= 6) {
			System.out.println("Possibly a valid day");
		} else {
			System.out.println("Days are normally 6 chars or longer");
		}
		String today = "Monday";
		if (day.equals(today)) {
			System.out.println(true);
		}
		
	}
}