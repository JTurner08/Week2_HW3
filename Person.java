package People;

public class Person {
	//instance variables
		static int snn;
		String name;
		String dob;
		
		// empty constructor
		public Person() {
			Math.ceil((Math.random() * 100 )/ 100);	
		}
		
		// parameterized constructor
		public Person(String name, String dob){
		this.name = name;
		this.dob = dob;
		}
}