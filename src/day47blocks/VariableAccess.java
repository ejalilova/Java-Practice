package day47blocks;

public class VariableAccess {
	//instance variable
	int myInstanceVar = 40;
	
	//static variable
	static int myStaticVariable = 55;
	
	public static void main(String[] args) {
	//	System.out.println(myInstanceVar); - not working
		System.out.println(myStaticVariable);
		//create object of VariableAccess & print myInstanceVar
		VariableAccess v = new VariableAccess();
		System.out.println(v.myInstanceVar);
		
		System.out.println(v.myStaticVariable);
		System.out.println(VariableAccess.myStaticVariable);
		
		
		
	}

}
