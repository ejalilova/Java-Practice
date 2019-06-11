package TryingHomework;

public class HW202 {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	String brand = "undefined";

	public HW202() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	public HW202(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	public boolean isOn() {
		return on;
	}

	public void turnOff() {
		if (!on) {

			System.out.println("TV is already OFF");
		} else {
			on = false;
		}
	}

//public void turnOff() {

//}
	public void turnOn() {
		if (on) {

			System.out.println("TV is already ON");
		} else {
			on = true;
		}
	}

	public void volumeUp() {
		setVolumeLevel(volumeLevel+1);
		
	}

	public void volumeDown() {
		setVolumeLevel(volumeLevel-1);
		
	}

	public void channelUp() {
		setChannel(channel+1);
		
	}

	public void channelDown() {
		setChannel(channel-1);
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if (!on || volumeLevel < 1 || volumeLevel > 7) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");

		} else {
			this.volumeLevel = volumeLevel;

		}

	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {

		if (channel <= 0 || channel > 120) {
			
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		} else {
			this.channel = channel;
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
