package day2.assignment9;

public class Student {
	private static int studentId=549;
	private char studentType;
	private String studentName;
	public Student(){
		studentId++;
	}
	public Student(char sType,String fname,String lname){
		this();
		studentName = fname+" "+lname;
		studentType = sType;
	}
	public void displayDetails(Student ob) {
		System.out.println("Student id is "+studentId);
		System.out.println("Student type is "+ob.studentType);
		System.out.println("Student name is "+ob.studentName);
		
	}

	public static void main(String[] args) {
		
		Student st1 = new Student('D',"Bony","Thomas");
		st1.displayDetails(st1);
		Student st2 = new Student('H',"Dinil","Bose");
		st2.displayDetails(st2);
	}

}
