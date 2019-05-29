package TuesdayWednMond;

public class PetSmart {
	public static void main(String[] args) {
		Cat murodilsCat = new Cat();
		murodilsCat.breed = "persian cat";
		murodilsCat.name = "Bars";
		sellCat(murodilsCat);
		OnlineCat marufsImaginaryCat = new OnlineCat();
		marufsImaginaryCat.breed = "lebanese";
		marufsImaginaryCat.name = "Tars";
		marufsImaginaryCat.location = "Arlington, TX";
		
		sellCatOnline(marufsImaginaryCat);
		murodilsCat.makeSomeNoice();
		marufsImaginaryCat.makeSomeNoice();
		
		
	}

	public static void sellCat(Cat cat) {
		System.out.println("selling " + cat.breed);
		System.out.println("It's name is " + cat.name);
	}

	public static void sellCatOnline(OnlineCat cat) {
		System.out.println("selling " + cat.breed);
		System.out.println("It's name is " + cat.name);
		System.out.println("It's location is " + cat.location);
		
	}
}
