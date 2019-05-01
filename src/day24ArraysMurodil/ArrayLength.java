package day24ArraysMurodil;

public class ArrayLength {
	public static void main(String[] args) {
		//declare array that can store array names, 5 names
	String names[] = new String [5];
	names[0] = "Tanya";
	names[1] = "Enya";
	names[2] = "Olya";
	names[3] = "Yulya";
	names[4] = "Inna";
	System.out.println(names.length);
	
	String name = names[1];
	System.out.println(name.length());
	}

}

