package day07_scanner_class;

public class PreAndPostVersion22 {
	public static void main(String[] args) {
		
	
	int messages =10;
	messages++;
	++messages;
	
	System.out.println("Messages: "+messages);
	
	
	int readMessages = --messages;
	System.out.println("readMessages: "+readMessages);//11
	System.out.println("Messages: "+messages);//11
	
	int unreadMessages = readMessages--;
	
	System.out.println("unreadMessages: "+unreadMessages);//11
	System.out.println("readMessages: "+readMessages);//10
	
	int total = unreadMessages++ - readMessages--;
	
	System.out.println("unreadMessages: "+unreadMessages);//12
	System.out.println("readMessages: "+readMessages);//9
	
	System.out.println("Total: "+total);//1
	
	int count = 20;
	int count2 = 10;
	
	int totalCount= ++count + --count2;
	
	System.out.println("count: "+count);//21
	System.out.println("count2: "+count2);//9
	
	System.out.println("totalCount: "+totalCount);//21+9=30
	
	int myCount = count++ + ++count;//
	
	System.out.println("Count: "+count);//23
	System.out.println("MyCount: "+myCount);//21+23

	
	
	
	
	
	
	}
}
