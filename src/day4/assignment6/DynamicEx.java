package day4.assignment6;

class Student{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	public void setStudentId(int sId) {
		this.studentId = sId;
	}
	public void setStudentType(char sType) {
		this.studentType = sType;
	}
	public void setStudentName(String sName) {
		this.studentName = sName;
	}
	//public void setResAddress(String raddress){}
	public void getDetails() {
		System.out.println("Student ID "+studentId);
		System.out.println("Student Type: "+studentType);
	}
}

class DayScholar extends Student{
	private String residentialAddress;
	public void setResAddress(String resAddress) {
		this.residentialAddress = resAddress;
	}
	public void getDetails() {
		super.getDetails();
		System.out.println("Student Name "+studentName);
		System.out.println("Residential Address "+residentialAddress);
	}
}

public class DynamicEx {

	public static void main(String[] args) {
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas");
		dayScholar.setResAddress("No 32/3 Vijayanagar");
		dayScholar.getDetails();

	}

}
