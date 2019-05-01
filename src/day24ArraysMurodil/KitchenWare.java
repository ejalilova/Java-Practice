package day24ArraysMurodil;

public class KitchenWare {
	public static void main(String[] args) {
		String[] kitchenItems = {"knife", "Wooden spoon", "plates",
				"cups", "forks", " pan", "pot ", " Trash can",
				"fridge", "dishwasher"};
		
		for(String item : kitchenItems ) {
		//System.out.println(item); will print out all items
		switch (item.toLowerCase().trim()) {
		case "knife" :
		System.out.println("Knife is used for cutting veggies");
		break;
		case "wooden spoon" :
			System.out.println("wooden spoon is used for cutting veggies");
			break;
		case "plates" :
			System.out.println("plates is used for cutting veggies");
			break;
		case "cups" :
			System.out.println("cups is used for cutting veggies");
			break;	
		case "forks" :
			System.out.println("forks is used for cutting veggies");
			break;	
		case "pan" :
			System.out.println("pan is used for cutting veggies");
			break;
		case "pot" :
			System.out.println("pot is used for cutting veggies");
			break;	
		case "trash can" :
			System.out.println("trash can is used for cutting veggies");
			break;	
		case "fridge" :
			System.out.println("fridge is used for cutting veggies");
			break;	
		case "dishwasher" :
			System.out.println("dishwasher is used for cutting veggies");
			break;	
		}
		
		
		}
	}

}
