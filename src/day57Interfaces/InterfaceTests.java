package day57Interfaces;

public class InterfaceTests {
public static void main(String[] args) {
	
	//Electric el = new Electric(); cannot create object of interface
	Tesla t = new Tesla();
	BMWi8  i8 = new BMWi8();
	
	t.charge();
	i8.charge();
	t.drive();
	t.selfDrive();
	
	Electric el2 = new Tesla();//this is polymorphism
	
}
}
