package day3.assignment8;
import java.util.Scanner;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth;
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
	public void setResidentialStatus(String status) {
		this.residentialStatus = status;
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
	public String getResidentialStatus(){
		return this.residentialStatus;
	}
	public String getFees() {
		return Double.toString(this.feesPerMonth);
	}
	public void calculateFees(double semesterFees) {
		this.feesPerMonth = semesterFees/6.0;
	}
	public void calculateFees(double semesterFees, double hostelFees) {
		this.feesPerMonth = semesterFees/6.0;
		this.feesPerMonth = this.feesPerMonth+hostelFees;
	}
	
	public static void main(String[] args) {
		double sFees;
		double hFees;
		Scanner input = new Scanner(System.in);
		Student student = new Student(12,'F',"Shyam","Aryal");
		student.setResidentialStatus("Day Scholar");
		if(student.getResidentialStatus().equalsIgnoreCase("Day Scholar")) {
			System.out.println("Please enter the semesterFee");
			sFees = input.nextDouble();
			student.calculateFees(sFees);
		}
		else {
			System.out.println("Please enter the semester Fee");
			sFees = input.nextDouble();
			System.out.println("Please enter the hostel Fee");
			hFees = input.nextDouble();
			student.calculateFees(sFees,hFees);
		}
		System.out.println("Student details are:");
		System.out.println("Student Id is "+student.getStudentId());
		System.out.println("Student Type is "+student.getStudentType());
		System.out.println("Student Name is "+student.getStudentName());
		System.out.println("Student residential Status is "+student.getResidentialStatus());
		System.out.println("Student fees pre month is "+student.getFees());
	}

}
