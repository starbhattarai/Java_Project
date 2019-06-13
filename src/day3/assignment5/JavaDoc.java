package day3.assignment5;
import java.util.Scanner;

public class JavaDoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the user name");
		String name = input.nextLine();
		System.out.println("Length of the name is "+name.length());
		System.out.println("Hi "+name);
		System.out.println("Lower case name is "+name.toLowerCase());
		System.out.println("Upper case name is "+name.toUpperCase());
		System.out.println("Does  name start with letter 'a'? "+name.startsWith("a"));
		System.out.println("Repalced name is "+name.replace(name, "KRISHNA"));		
	}

}
