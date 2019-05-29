package TryingHomework;

public class HW201 {
	private String firstName;
	  private String lastName;
	  private int age;
	  
	  public HW201() {
	    firstName = "undefined";
	    lastName = "undefined";
	    age = -1;
	  }
	  public HW201(String firstName, String lastName, int age){
	    setFirstName(firstName);
	    //this.firstName = firstName;
	    this.lastName = lastName;
	    this.age = age;
	  }
	  
	  public String toString() {
	   return firstName+" | "+lastName+" | "+age;
	  }
	  
	  public String getFirstName(){
	    return firstName;
	  }
	  public void setFirstName(String firstName){
	    this.firstName = firstName;
	  }
	  public String getLastName(){
	    return lastName;
	  }
	  public void setLastName(String lastName){
	    this.lastName = lastName;
	  }
	  public int getAge(){
	    return age;
	  }
	  public void setAge(int age){
	    this.age = age;
	  }
	  
	 

}
