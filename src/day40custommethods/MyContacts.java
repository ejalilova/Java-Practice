package day40custommethods;

public class MyContacts {
	public static void main(String[] args) {
		Contact evgenia = new Contact();
		evgenia.name = "Evgenia Jalilova";
		evgenia.phoneNumber = "(202) 333 - 4444";
		evgenia.email = "evgenia@thorlabs.com";
		
		evgenia.call();
		evgenia.sendMessage();
		evgenia.sendEmail();
		
		Contact orhan = new Contact();
		orhan.name = "Orhan Sultanov";
		orhan.phoneNumber = "(571) - 657 - 7658";
		orhan.email = "orhan@gmail.com";
		
		System.out.println("Name: " + orhan.name);
		System.out.println("Phone number: " + orhan.phoneNumber);
		System.out.println("Email: " + orhan.email);
		
		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();
		
		evgenia.call();
		
	}
}
