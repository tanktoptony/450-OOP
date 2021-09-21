package oopBasics2;

public class CopyObject {
}

class Student{
	
	int studentID;
	String name;
	
	public Student (int studentID, String name)
	{
		this.studentID =studentID;
		this.name =name;
		
	}
	
	// copy constructor
	
	public Student (Student student)
	{
		
		this.studentID =student.studentID;
		this.name =student.name;
	}
	
	
	public void displayDetails()
	{
		System.out.println("Name="+ name + " StudentID: " +studentID);
		
		
	}
	
	
}

class DemoCopyConstructor
{



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Student s =new Student();
		Student s1 = new Student (12345, "Wael");
		System.out.println("Student Details :");
		s1.displayDetails();
		
		System.out.println("copying s1 to s2");
		Student s2 = new Student(s1);
		s2.displayDetails();
	}

}
