package day40custommethods;

public class Contact {
	String name;
	String phoneNumber;
	String email;

	

	public void call() {
		System.out.println("Calling " + name + "...");
	}

	public void sendMessage() {
		System.out.println("Sending Message " + phoneNumber);
	}

	public void sendEmail() {
		System.out.println("Sending email " + email);
	}
}

//call
//send message
//sendEmail