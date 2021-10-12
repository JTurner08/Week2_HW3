package People;

public class Employee extends Person{
	long emp_id;
	double salary;
	String parkingSpot;
	
	// Empty
	public Employee() {
		
	}
	
	// Parameterized 
	public Employee(String name, String dob, long emp_id, double salary, String parkingSpot) {
		super(name, dob);
		this.emp_id = emp_id;
		this.salary = salary;
		this.parkingSpot = parkingSpot;
	}
}
	