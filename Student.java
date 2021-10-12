package People;

public class Student extends Person{
	private int subject1, subject2, subject3;
	private int sID;
	
	// Empty constructor
	public Student() {
		
	}
	
	// Parameterized Constructor
	public Student(String name, String dob, int subject1, int subject2, int subject3, int sID ) {
		super(name, dob);
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.sID = sID;
	}
	
	
	public int getSubject1() {
		return subject1;
	}

	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}

	public int getSubject2() {
		return subject2;
	}

	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}

	public int getSubject3() {
		return subject3;
	}

	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}

	public int getsID() {
		return sID;
	}

	public void setsID() {
		this.sID = sID;
	}

}