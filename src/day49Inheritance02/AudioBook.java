package day49Inheritance02;

public class AudioBook extends Book {
	
	private double length;
	private String narator;
	
	public void listen() {
		System.out.println("Listening " + getTitle() + " by " + getAuthor() + " and narrated by " + narator);
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getNarator() {
		return narator;
	}
	public void setNarator(String narator) {
		this.narator = narator;
	}
	
	

}
