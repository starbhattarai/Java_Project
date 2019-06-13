package day3.assignment2;

public class DemoArray {

	public static void main(String[] args) {
		int firstArrayMatrix[][] = {{1,1,1},{1,1,1}};
		int secondArrayMatrix[][] = {{2,2,2},{2,2,2}};
		for(int i=0;i<firstArrayMatrix.length;i++) {
			for(int j = 0; j<firstArrayMatrix[0].length;j++) {
				System.out.print(firstArrayMatrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<secondArrayMatrix.length;i++) {
			for(int j = 0; j<secondArrayMatrix[0].length;j++) {
				System.out.print(secondArrayMatrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Sum of the two matrices Matrix 1 and Matirx 2 is:");
		System.out.println();
		for(int i=0;i<secondArrayMatrix.length;i++) {
			for(int j = 0; j<secondArrayMatrix[0].length;j++) {
				System.out.print(firstArrayMatrix[i][j]+secondArrayMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
