package day5.assignment1.courseregistration;

class Student{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	public void setStudentId(int id) {
		this.studentId = id;
	}
	public void setStudentType(char sType) {
		this.studentType = sType;
	}
	public void setStudentName(String sName) {
		this.studentName = sName;
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
	public void getDetails() {
		System.out.println("Details of the Student are: ");
		System.out.println("Student Id is: "+studentId);
		System.out.println("Student Name is: "+studentName);
		System.out.println("Student Type is: "+studentType);
		
	}
}

class PackageEx{
	public static void main(String args[]) {
		Student student = new Student();
		student.setStudentId(1001);
		student.setStudentType('D');
		student.setStudentName("Thomas");
		student.getDetails();
	}
}
