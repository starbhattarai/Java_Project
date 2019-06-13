package day5.assignment2.registrationpack;
import day5.assignment2.studentpack.Student;
class DayScholar extends Student{
	private String residentialAddress;
	public void setResAddress(String reAddress) {
		this.residentialAddress = reAddress;
	}
	public void getDetails() {
		System.out.println("Student Id"+studentId);
		System.out.println("Student Id"+studentType);
		System.out.println("Student Id"+studentName);
	 }

}
public class Registration{
	public static void main(String args[]) {
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("dinil");
		dayScholar.getDetails();
	}
}

