package day41;

public class Microwave {
	String brand;
	boolean isOn;//false

public void turnOn() {
	if (isOn == true) {
		
		System.out.println(brand + " is already on");
	} else {	
		System.out.println("Turning on " + brand + " the microwave");
		isOn = true;
}
}
	public void turnOff() {
		if (isOn == false) {
			System.out.println(brand + " is already on");
		} else {
			System.out.println("Turning off " + brand+" the microwave");
			isOn = false;
		}
	}

	public void heat(String food) {
		if (isOn) {
			System.out.println("Heating " + food);
		} else {
			System.out.println("Microwave is off, cannot heat " + food);
		}
	}

}