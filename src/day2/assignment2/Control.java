package day2;

public class Control {

	public static void main(String[] args) {
		boolean bool = true;
		for(int i = 0; i<5;i++) {
			for(int j = 0; j<10;j++) {
				System.out.print(j+"\t");
				if(j>5) {
					System.out.println();
					continue;
				}
			}
			System.out.println("Outer loop");
		}
		System.out.println("End");
	}

}
