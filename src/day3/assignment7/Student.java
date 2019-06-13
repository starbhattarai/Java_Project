package day3.assignment7;

public class Student {
	private int studentId;
	private String studentName;
	private String residentialStatus;
	private long feesPerMonth;
	public Student() {
	}
	public void setStudentId(int id) {
		this.studentId = id;
	}
	public void setStudentName(String firstName,String lastName) {
		this.studentName = firstName+" "+lastName;
	}
	public void setResidentialStatus(String status) {
		this.residentialStatus = status;
	}
	public void setFees(long semesterFee,long hostelFee) {
		this.feesPerMonth = semesterFee+hostelFee;
	}
	public int getStudentId() {
		return this.studentId;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public String getResidentialStatus(){
		return this.residentialStatus;
	}
	public long getFees() {
		return this.feesPerMonth;
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		int sId = Integer.parseInt(args[0]);
		String fName = args[1];
		String lName = args[2];
		String rStatus = args[3];
		int sFee = Integer.parseInt(args[4]);
		int hFee= 0;
		if(args.length>5 && rStatus.equals("Hostelite")) {
			hFee = Integer.parseInt(args[5]);
		}
		student.setStudentId(sId);
		student.setStudentName(fName, lName);
		student.setResidentialStatus(rStatus);
		student.setFees(sFee,hFee);
		System.out.println("Student details are:");
		System.out.println("Student Id is "+student.getStudentId());
		System.out.println("Student Name is "+student.getStudentName());
		System.out.println("Student residential Status is "+student.getResidentialStatus());
		System.out.println("Student Total fee is "+student.getFees());
	}

}
