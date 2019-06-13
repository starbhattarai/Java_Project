package day2.assignment7;

public class PassByVal {

	public static void main(String[] args) {
		//int sid = 25;
		PassByVal val = new PassByVal();
		Student ram = new Student();
		System.out.println(ram.getStudentId());
		val.passTheValueMethod(ram);
		System.out.println("The sid are "+ram.getStudentId());
	}
	
	public void passTheValueMethod(Student ob) {
		ob.setStudentId(10);
		System.out.println("The sId are "+ob.getStudentId());
	}

}
