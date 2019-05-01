package TryingHomework;

public class HW161MethodswithReturn6WaterTax {
	public static void main(String[] args) {
	}
	
		 public double waterTax(double units) {
			    double bill = 0.0;
			    
			    //your code here
			    
			    if (units <= 50) {
			       bill = units * .60;
			    } else if (units > 50 && units < 100) {
			       bill = units * .90;
			    } else if (units >= 100) {
			       bill = units * .60 + 50;
			    } else if (units >= 150) {
			       bill = units * .90 + 100;
			    }
			    
			    //end your code here
			    
			    return bill;
			  }//end waterTax

			  
			}