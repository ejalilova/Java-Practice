package TryingHomework;

public class TV {

	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	String brand = "undefined";

	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	public TV(String brand) {
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	public void isOn() {
		if (on) {
			on = true;
			System.out.println("TV is already ON");
		}
	}

	public void isOff() {
		if (!on) {
			on = false;
			System.out.println("TV is already OFF");
		}
	}

	public void turnOff() {

	}

	public void volumeUp() {
		volumeLevel++;
	}

	public void volumeDown() {
		volumeLevel--;
	}

	public void channelUp() {
		channel++;
	}

	public void channelDown() {
		channel--;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int VolumeLevel) {
		if (VolumeLevel >= 1 && VolumeLevel <= 7) {
			this.volumeLevel = volumeLevel;
			
		}
		if (!on) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
		if (channel <= 0 && channel > 120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}