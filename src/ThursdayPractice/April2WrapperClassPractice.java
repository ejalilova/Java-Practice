package ThursdayPractice;

public class April2WrapperClassPractice {
	public static void main(String[] args) {
		int num = 10;//primitive
		Integer num2 = new Integer(10);//object
		Integer num3 = new Integer(10);
		System.out.println(num == num2);
		System.out.println(num2 == num3);
		System.out.println(num2.equals(num3));
		System.out.println(num2.intValue() == num3.intValue());
		num2 = num3;
		System.out.println(num2 == num3);
		//how to convert text into number?
		String age = "18";
		//another way:
		int agenum2 = Integer.valueOf(age);//returns object of Integer class/coz of auto unboxing we don't see any difference
		//one way:
		int agenum = Integer.parseInt(age);//returns int primitive
		if (agenum > 21) {
			System.out.println("You are fine");
		} else {
			System.out.println("underage");
		}
	Integer n = 8;
	String text = "Wind: 5 mph";
	//create if statement to find if wind is safe
	//if speed is >30ph print you are in danger// otherwise print you are safe
	String speed = text.substring(text.indexOf(":") + 2, text.lastIndexOf(" ")); //string
	int convertedSpeed = Integer.parseInt(speed); //int
	System.out.println(speed);
	System.out.println(convertedSpeed);
	if (convertedSpeed >= 30) {
		System.out.println("you are in danger");
	} else {
		System.out.println("you are safe");
	}
	int max = Integer.MAX_VALUE;
	int min = Integer.MIN_VALUE;
	System.out.println(max + ":" + max);
	System.out.println(Integer.toBinaryString(5));
	}

}






