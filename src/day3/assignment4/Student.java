package day3.assignment4;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	public Student() {
		this.studentId = 10;
		this.studentType = 'F';
	}
	public Student(int id,char type,String firstName,String lastName){
		studentId = id;
		studentType = type;
		studentName = firstName+" "+lastName;

	}
	public void setStudentId(int id) {
		this.studentId = id;
	}
	public void setStudentType(char stype) {
		this.studentType = stype;
	}
	public void setStudentName(String firstName,String lastName) {
		this.studentName = firstName+" "+lastName;
	}
	public int getStudentId() {
		return this.studentId;
	}
	public char getStudentType() {
		return this.studentType;
	}
	public String getStudentName() {
		return this.studentName;
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		String fName = "Ram";
		String lName = "Aryal";
		int sid = 1;
		char type  = 'F';
		student.setStudentId(sid);
		student.setStudentName(fName, lName);
		student.setStudentType(type);
		System.out.println("Student name is "+student.getStudentName()+" and id is "+student.getStudentId()+" and type is "+student.getStudentType());
		Student newStudent = new Student(5,'O',"Hari","Shrestha");
		System.out.println("Student name is "+newStudent.getStudentName()+" and id is "+newStudent.getStudentId()+" and type is "+newStudent.getStudentType());
	}

}
