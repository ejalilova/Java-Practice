package Practice;

public class Chrome extends Browser{
	
	public Chrome(String name, int id) {
	super(name, id);	
	}
	@Override
	public void navigate(String url) {
		System.out.println("Chrome - navigating to " + url);
	}
	//public abstract void displayWebpage();
	@Override
	public void displayWebpage() {
		System.out.println("Chrome - displaying webpage ");
	}
	//public abstract boolean launch();
	public boolean launch() {
		System.out.println("Chrome is launching");
		System.out.println("1 2 3");
		return true;
	}
	public void close() {
		System.out.println("Exeting netscape");
	}
}
