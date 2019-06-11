package day56Abstarction02;

public class Netscape extends Browser {

	// public abstract void navigate(String url);
	//@Override
	public void navigate(String url) {
		System.out.println("Netscape - navigating to " + url);
	}

	// public abstract void displayWebpage();
	//@Override
	public void displayWebpage() {
		System.out.println("Netscape - displaying webbpage");
	}

	// public abstract boolean launch();
	public boolean launch() {
		System.out.println("Netscape is launching");
		System.out.println("1 2 3");
		return true;
	}
	public void close() {
		System.out.println("Exiting netscape");
	}
}
