package TryingHomework;

public class HW206GasTank {
	double amount = 0;
	  double capacity;
	  
	  public HW206GasTank (double capacity){
	    this.capacity = capacity;
	  }
	  public void addGas(double amount) {
	    amount += amount;
		  if (amount > capacity) {
			  amount = capacity;
		  }
	  }
	  public void useGas(double usage){
	    amount -= usage;
	    if (amount < 0) {
	    	amount = 0;
	    }
	  }
	  public boolean isEmpty(){
	    if (amount < 0.1) {
	      return true;
	    } else {
	      return false;
	    }
	  }
	 public boolean isFull(){
	   if(amount > 0.1) {
	     return true;
	   } else {
	     return false;
	   }
	 }
	 public double getGasLevel(){
	   return amount;
	 }
	 public double fillUp(){
	   capacity++;
	   double difference = capacity - amount;
	   return difference;
	 }
	}
