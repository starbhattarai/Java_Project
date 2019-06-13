package day5.selfreview2;
interface Count{
	short counter = 0;
	void countUp();
}

public class TestCount implements Count{
	public void countUp() {
		for (int x=6;x>counter;x--) {
			System.out.println(" "+x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCount test = new TestCount();
		test.countUp();

	}

}
