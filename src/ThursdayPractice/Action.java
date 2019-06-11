package ThursdayPractice;

public class Action extends Movie{
	
	
	public Action(String rating, int iDNumber, String title, Director director) {
		super(rating, iDNumber, title, director);
	
	}

	public double calcLateFees(int numberDays);
return numberDays * 3 ;
	

}
