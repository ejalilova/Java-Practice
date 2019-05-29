package day46statickeyword;

public class Campus {
	private String city;

	static {
		System.out.println("static block");// runs once in the beginning
	}

	public Campus(String city) {
		System.out.println("Constructor");
		this.city = city;

	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static void campusInfo() {
		System.out.println("Welcome to campus!");
	}
}
