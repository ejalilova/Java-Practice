package TryingHomework;

public class HW165MethodsWithReturnSpecialDrink {
	public static void main(String[] args) {
		//getThunderBlazz(boolean avilable,boolean gift, int ingredient1, int ingredient2, int ingredient3);
		
		//getThunderBlazz(true, false, 5, 6, 9);
	}

	public boolean getThunderBlazz(boolean available, boolean gift, int ingredient1, int ingredient2, int ingredient3) {

		if ((available == true || gift == true) || (ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3) || (ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2)) {

			return true;
		} else {
			return false;
		}

	}
}
//getThunderBlazz(true,false,1,2,3)
//returns true