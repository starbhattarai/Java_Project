package day3.assignment3;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[][]= { {"Tony","JAVA","C","C++"},{"Thomas","JAVA","UNIX",""},{"Dinil","Linux","Oracle",""},{"Delvin","RDBMS","C#","ORACLE"}};
		for(int i = 0;i<array[3].length;i++) {
			System.out.print(array[3][i]+" ");
		}
		System.out.println();
	}

}
