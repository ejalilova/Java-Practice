package ThursdayPractice;

public class SmartPhone extends MP3Phone{
	private boolean isTouchScreen;
	
public SmartPhone(String phoneNumber, int memprySize, boolean isTouchScreen) {
	super(phoneNumber, memprySize, true);
	this.isTouchScreen = isTouchScreen;
	
}
}
