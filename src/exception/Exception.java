package exception;

public class Exception {

	public static void main(String[] args) {
		int[] array = new int[4];
		int b = 0;
		int c=0;
		int e =6;
		try {
			c = array[5]+(e/b); 
		}
		catch(ArithmeticException y) {
			System.out.println("Divide by zero");
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Check the index of the array");
			System.exit(0);
		}
		System.out.println(c);
	}

}
