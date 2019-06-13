package day4.assignment8;
abstract class Student {
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
	public abstract void calculateFees(double var);
	public void displayStudentDetails() {
		System.out.println("Details of the Student are: ");
		System.out.println("Student Id is: "+getStudentId());
		System.out.println("Student Name is: "+getStudentName());
		System.out.println("Student Type is: "+getStudentType());
		
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
	public void calculateFees(double semesterFee) {
		feesPerMonth = semesterFee/6.0;
		feesPerMonth = feesPerMonth+1200;
		System.out.println("Fees per Month is "+feesPerMonth);
	}
	public String getHostelName() {
		return this.hostelName;
	}
	public int getRoomNumber() {
		return this.roomNumber;
	}
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Student hostelName is: "+getHostelName());
		System.out.println("Student hostel room NO is: "+getRoomNumber());
		
	}

	public static void main(String[] args) {
		String rstatus = args[0];
		Student student; 
		if(rstatus.equals("Hostelite")) {
			student = new Hostelite(2,'F',"Hari","Aryal","New Hostel",25);
		}
		else {
			student = new DayScholar(5,'N',"Shyam","Buda","Baneshwor New");
		}
		student.displayStudentDetails();
		student.calculateFees(2400);
	
	}
}
class DayScholar extends Student{
	private String residentialAddress;
	public DayScholar() {
		
	}
	public DayScholar(int id, char type, String fName,String lName,String rAddress) {
		//super(id,type,fName,lName);
		super.studentId = id;
		super.studentType = type;
		super.studentName = fName+" "+lName;
		this.residentialAddress = rAddress;
	}
	public void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees/6.0;
		System.out.println("Per month fees is "+feesPerMonth);
	}
	public String getResidentialAddress() {
		return this.residentialAddress;
	}
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Student hostelName is: "+getResidentialAddress());
	}
}

