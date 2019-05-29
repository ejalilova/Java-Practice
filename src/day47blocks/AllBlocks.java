package day47blocks;

public class AllBlocks {
	int nonStaticInt = 10;
	static int staticInt = 10;

	static {
		System.out.println("Static block - I run first and only once");
		staticInt--;
	}
	{
		System.out.println("Init block - I run each time object is created before constructor");
		nonStaticInt += 5;
		staticInt += 5;
		
	}

	public AllBlocks() {
		System.out.println("Constructor - I run each time object is created after init block");
		nonStaticInt += 3;
		staticInt += 3;
	}
}
