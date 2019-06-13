package day1;

public class Operator {

	public static void main(String[] args) {
		int intVal = 10;
		float floatVal = 3.0f;
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		System.out.println("Arithmetic");
		System.out.println(intVal+"%"+floatVal+" = "+(intVal%floatVal));
		if(bool1 || (bool1 && (bool2=false))) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
	}

}
