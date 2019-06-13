package day2;

public class CourseManagement {

	public static void main(String[] args) {
		int sid1 = 1;
		char stype1 = 'F';
		Student ram = new Student();
		ram.setStudentId(sid1);
		ram.setStudentType(stype1);
		System.out.println("Ram student id is: "+ram.getStudentId()+"  and student type is "+ram.getStudentType());

	}

}
