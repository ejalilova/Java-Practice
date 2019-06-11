package TryingHomework;

public class HW205 {

	  int timeLeft = 0;
	  int maxTime;
	  
	  public HW205(int maxTime){
	    this.maxTime = maxTime;
	  }
	  public boolean add(int num){
	      if (num == 25 || timeLeft > maxTime) {
	      timeLeft += 30;
	      return true;
	      } else {
	     
	     return false;
	    }
	    
	  }
	 public void tick(){
	    if (timeLeft > 0){
	      timeLeft -= 1;
	    }
	  }
	  public boolean isExpired(){
	      if (timeLeft == 0) {
	      return true;
	    } else {
	      return false;
	    }
	  }
	}
