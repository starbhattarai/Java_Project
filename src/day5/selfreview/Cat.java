package day5.selfreview;
abstract class Animal{
	static void testClassMethod() {
	
	}
	public void testInstanceMethod() {
		System.out.println("The instance method in Animal.");
	}
}

class Cat extends Animal{
	public static void testClassMethod() {
		System.out.println("The class mehtod in Cat.");
	}
	/*public void testInstanceMethod() {
		System.out.println("The instance method in Cat.");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		Animal.testClassMethod();
		myAnimal.testInstanceMethod();
		Cat.testClassMethod();
	}

}
