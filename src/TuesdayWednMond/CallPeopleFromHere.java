package TuesdayWednMond;

public class CallPeopleFromHere {
	
		public static void main(String[] args) {
			
			People mymanNursultan = new People();
			System.out.println(mymanNursultan.hardToGet);
			
			System.out.println(People.easyToGet);
			
			//use object to access the non static method
			mymanNursultan.sayMyName();
			//use class name to access the static method
			People.whatMyName();
			
			
			
		}
}
