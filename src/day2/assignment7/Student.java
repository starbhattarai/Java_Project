package day2.assignment7;

public class Student {
	private int sid;
	private char stype;
	Student(){
		this.sid = 25;
		this.stype = 'F';
	}
	public void setStudentId(int sid) {
		this.sid = sid;
	}
	public void setStudentType(char stype) {
		this.stype = stype;
	}
	public int getStudentId() {
		return this.sid;
	}
	public char getStudentType() {
		return this.stype;
	}
	
	public static void main(String[] args) {
		Student hari = new Student();
		System.out.println("Hari id is "+hari.getStudentId()+" and student type is "+hari.getStudentType());
	}

}
