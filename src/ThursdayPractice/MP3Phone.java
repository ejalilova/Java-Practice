package ThursdayPractice;

public class MP3Phone extends Phone{
	
	private int memorySize;
	private boolean playsAAC;
	
	public MP3Phone(String phoneNumber, int memorySize, boolean playAAC){
		super(phoneNumber, true);
		this.memorySize = memorySize;
		this.playsAAC = playsAAC;
		
	}
	
}
