package day38ArrayList03;
import java.util.ArrayList;
public class RawArrayList {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("Saturday");//all values are stored as a raw type. also called General Object type
	list.add("Java day");
	list.add(1000);
	list.add(5.9);
	list.add(true);
	list.add(false);
	System.out.println(list.toString());//automatically call to String()
	String allValues = list.toString();
	System.out.println(allValues);
	
	
}
}

