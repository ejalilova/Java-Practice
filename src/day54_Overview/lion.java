package day54_Overview;

public class lion {

	public lion(double b) {
		
	}
	
	public lion(int a) {
		System.out.println("A");
	}
	
}

public class constructor_Practice2 extends lion {

//	constructor_Practice2(){   }   reason: #12
	
	constructor_Practice2(boolean b){
		super(9);
	}
		
	
}
