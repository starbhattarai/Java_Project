package day3.assignment1;

public class Student {
	private int studentId=550;
	private static int studentCount;
	private char studentType;
	private String studentName;
	static {
		studentCount = 10;
	}
	public Student(){
		studentCount++;
		studentId = studentId+studentCount;
	}
	public Student(char sType,String fname,String lname){
		this();
		studentName = fname+" "+lname;
		studentType = sType;
	}
	public static int getStudentCount() {
		return studentCount;
	}
	public void displayDetails(Student ob) {
		System.out.println("Student id is "+ob.studentId);
		System.out.println("Student type is "+ob.studentType);
		System.out.println("Student name is "+ob.studentName);
		
	}

	public static void main(String[] args) {
		
		Student st1 = new Student('D',"Bony","Thomas");
		st1.displayDetails(st1);
		System.out.println("Total number of student is "+getStudentCount());
		Student st2 = new Student('H',"Dinil","Bose");
		st2.displayDetails(st2);
		System.out.println("Total number of student is "+getStudentCount());
		
	}

}