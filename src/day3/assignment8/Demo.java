package day3.assignment8;

public class Demo {
	public static void main(String[] args) {
		Square square = new Square();
		square.display(5);
		System.out.println("The area of the square is "+square.calculateArea());
	}
}
class Square{
	int length;
	void display(int length) {
		this.length = length;
	}
	int calculateArea() {
		return (length*length);
	}
}
