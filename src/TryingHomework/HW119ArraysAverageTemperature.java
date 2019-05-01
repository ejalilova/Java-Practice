package TryingHomework;

public class HW119ArraysAverageTemperature {
	public static void main(String[] args) {
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = { 80, 88, 88, 84, 82, 78, 60, 68 };

		for (k = 0; k < temps.length; k++) {
			total = total + temps[k];

		}
		
		avgTemp = total / temps.length;
		System.out.println(avgTemp);
		//System.out.println(total);
	}

}
