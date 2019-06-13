package day4.assignment5;
class Student{
	protected static int studentId;
	protected char studentType;
	protected String studentName;
	
	public Student() {
		studentId++;
		
	}
	public Student(int sid,char stype, String sname) {
		this();
		//studentId = sid;
		studentType = stype;
		studentName = sname;
		System.out.println("Hello from Student");
	}
}

class PostGradStudent extends Student{
	protected int postCourseId;
	protected String postCourseName;
	protected int postCoursefees;
	
	public PostGradStudent(int postCourseId,String postCourseName,int postCoursefees,int studentId,char studentType,String studentName) {
		super(studentId,studentType,studentName);
		this.postCourseId = postCourseId;
		this.postCourseName = postCourseName;
		this.postCoursefees = postCoursefees;
		System.out.println("Hello from PostGradStudent");
	}
	public int getpostCourseId() {
		return this.postCourseId;
	}
	public String getpostCourseName() {
		return this.postCourseName;
	}
}

public class DayScholar extends PostGradStudent{
	private String residentialAddress;
	
	public DayScholar(int pCourseId,String pCourseName, int pCourseFees,int sid,char sType,String sName,String rAddress) {
		super(pCourseId,pCourseName,pCourseFees,sid,sType,sName);
		this.residentialAddress = rAddress;
		System.out.println("Hello from DayScholar");
	}
	public void calculateFees() {
		int fees = (int)super.postCoursefees/6;
		System.out.println("Fee is "+fees);
	}
	public int getfees() {
		return super.postCoursefees;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayScholar dayScholar = new DayScholar(5,"OOP",16000,1001,'D',"Manu","No 32/3 Vijayanagar");
		dayScholar.calculateFees();

	}

}
