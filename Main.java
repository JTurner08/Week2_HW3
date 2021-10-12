package People;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student(); 
		s1.name = "Jay";
		s1.dob = "January 1, 1990";
		s1.getsID();
		s1.getSubject1();
		s1.getSubject2();
		s1.getSubject3();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Student ID: ");
		int setsID = input.nextInt();
		System.out.println("Please enter Name: ");
		String name = input.next(); 
//		input.nextLine();
		System.out.println("Please enter dob: ");
		String dob = input.nextLine(); 
		input.nextLine();
		System.out.println("Please enter Subject 1 Grade: ");
		int setSubject1 = input.nextInt(); 
//		input.nextLine();
		System.out.println("Please enter Subject 2 Grade: ");
		int setSubject = input.nextInt(); 
//		input.nextLine();
		System.out.println("Please enter Subject 3 Grade: ");
		int setSubject3 = input.nextInt(); 
		 
		input.close();
		
		
		
	}

}