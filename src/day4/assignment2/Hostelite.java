package day4.assignment2;
class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	public Student() {
	}
	public Student(int id,char type, String firstName, String lastName) {
		this.studentId = id;
		this.studentType = type;
		this.studentName = firstName+" "+lastName;
		
	}
	public void setStudentId(int id) {
		this.studentId = id;
	}
	public void setStudentType(char sType) {
		this.studentType = sType;
	}
	public void setStudentName(String firstName,String lastName) {
		this.studentName = firstName+" "+lastName;
	}
	public void setFeesPerMonth(double fees) {
		this.feesPerMonth = fees;
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
	public double getFeesPerMonth() {
		return this.feesPerMonth;
	}
}

public class Hostelite extends Student{
	private String hostelName;
	private int roomNumber;
	public Hostelite() {
		
	}
	public Hostelite(int id, char type, String fName,String lName,String hostelName, int roomNo) {
		//super(id,type,fName,lName);
		super.studentId = id;
		super.studentType = type;
		super.studentName = fName+" "+lName;
		this.hostelName = hostelName;
		this.roomNumber = roomNo;
	}

	public static void main(String[] args) {
		Hostelite hostel = new Hostelite(2,'F',"Hari","Aryal","New Hostel",25);
		System.out.println("Details of the Hostelite are: ");
		System.out.println("Student Id is: "+hostel.getStudentId());
		System.out.println("Student Name is: "+hostel.getStudentName());
		System.out.println("Student Type is: "+hostel.getStudentType());
		System.out.println("Student hostelName is: "+hostel.hostelName);
		System.out.println("Student hostel room NO is: "+hostel.roomNumber);
	
	}
}

